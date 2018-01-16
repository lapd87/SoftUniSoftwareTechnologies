package todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import todolist.bindingModel.TaskBindingModel;
import todolist.entity.Task;
import todolist.repository.TaskRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
public class TaskController {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        //TODO:Implement me...
        List<Task> tasks =  this.taskRepository.findAll();

        model.addAttribute("tasks", tasks);
        model.addAttribute("view", "task/index");

        return "base-layout";
    }

    @GetMapping("/create")
    public String create(Model model) {
        //TODO:Implement me...

        model.addAttribute("task", new TaskBindingModel());
        model.addAttribute("view", "task/create");
        return "base-layout";    }

    @PostMapping("/create")
    public String createProcess(Model model, @Valid TaskBindingModel taskBindingModel,
                                BindingResult bindingResult) {
        //TODO:Implement me...

        if (bindingResult.hasErrors()) {
            model.addAttribute("message", "Invalid data.");
            model.addAttribute("task", taskBindingModel);
            model.addAttribute("view", "task/create");
            return "base-layout";
        }

        Task t = new Task();
        t.setTitle(taskBindingModel.getTitle());
        t.setComments(taskBindingModel.getComments());

        taskRepository.saveAndFlush(t);

        return "redirect:/";    }

    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        //TODO:Implement me...
        Task task = this.taskRepository.findOne(id);
        if (task == null)
            return "redirect:/";

        model.addAttribute("task", task);
        model.addAttribute("view", "task/delete");
        return "base-layout";
    }

    @PostMapping("/delete/{id}")
    public String deleteProcess(@PathVariable int id) {
        //TODO:Implement me...
        Task task = this.taskRepository.findOne(id);
        if (task == null)
            return "redirect:/";

        taskRepository.delete(task);
        taskRepository.flush();

        return "redirect:/";
    }
}
