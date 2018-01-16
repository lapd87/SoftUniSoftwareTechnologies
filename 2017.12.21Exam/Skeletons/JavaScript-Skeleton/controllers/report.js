const Report = require('../models/Report');

module.exports = {
    index: (req, res) => {
        //TODO: Implement me ...

        Report.find().then(reports => {
            return res.render('report/index', {'reports': reports});
        }).catch(() => {
            return res.send("error");
        });
    },
    createGet: (req, res) => {
        //TODO: Implement me ...
        res.render('report/create');

    },
    createPost: (req, res) => {
        //TODO: Implement me ...

        let report = req.body;

        Report.create(report).then(() => {
            res.redirect('/');
        });
    },
    detailsGet: (req, res) => {
        //TODO: Implement me ...

        let id = req.params.id;

        Report.findById(id).then(report => {
            res.render('report/details', report);
        });
    },
    deleteGet: (req, res) => {
        //TODO: Implement me ...
        let id = req.params.id;
        Report.findById(id).then(report => {
            if (report) {
                return res.render('report/delete', report);
            }
            else {
                return res.redirect('/');
            }
        }).catch(() => res.redirect('/'));
    },
    deletePost: (req, res) => {
        //TODO: Implement me ...

        let id = req.params.id;
        Report.findByIdAndRemove(id).then(data => {
            res.redirect('/');
        }).catch(err => res.redirect('/'));

    }
};