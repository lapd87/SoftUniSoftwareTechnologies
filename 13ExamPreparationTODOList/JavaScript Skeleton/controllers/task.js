const Task = require('../models/Task');

module.exports = {
    index: (req, res) => {
        //TODO: Implement me...
        Task.find().then(tasks => {
            return res.render('task/index', {'tasks': tasks});
        }).catch(err => {
            return res.send("error");
        });
    },
	createGet: (req, res) => {
        //TODO: Implement me...
        res.render('task/create');

    },
	createPost: (req, res) => {
        //TODO: Implement me...
        let task = req.body;
        Task.create(task).then(task => {
            res.redirect("/");
        }).catch(err => {
            task.error = 'Cannot create task.';
            res.render('task/create', task);
        });
	},
	deleteGet: (req, res) => {
        //TODO: Implement me...
        let id = req.params.id;
        Task.findById(id).then(task => {
            if (task) {
                return res.render('task/delete', task);
            }
            else {
                return res.redirect('/');
            }
        }).catch(err => res.redirect('/'));
	},
	deletePost: (req, res) => {
        //TODO: Implement me...
        let id = req.params.id;
        Task.findByIdAndRemove(id).then(data => {
            res.redirect('/');
        }).catch(err => res.redirect('/'));
	}
};