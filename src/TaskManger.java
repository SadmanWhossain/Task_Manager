import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class TaskManger {
    private Map<String, Task> TaskMap;
    public TaskManger() {
        this.TaskMap = new HashMap<>();
    }
    public void AddTask(String name, String des, String ddate){
        Task NewTask = new Task(des, ddate);
        TaskMap.put(name, NewTask);
        System.out.println("Name: "+ name +" Description: "+ des+" Created Date: "+ LocalDate.now() +" Due Date: "+ ddate);
    }
    public void CheckStatus(String name){
        Task NewTask = TaskMap.get(name);
        String status;
        if(NewTask.isCStatus()){status= "done";}
        else{status = "not done";}
        System.out.println("The task "+ name +" is "+status);
    }

    public void ViewAllTask(){
        for(Map.Entry<String, Task> entry: TaskMap.entrySet()){
            Task task = entry.getValue();
            System.out.println("Name: "+ entry.getKey()+
                    " Description: "+ task.getDes()+
                    " Created Date: "+ task.isCStatus()+
                    " Due Date: "+ task.getDDate());
        }
    }
    public void ViewATask(String name){
        Task NewTask = TaskMap.get(name);
        System.out.println("Name: "+ name +" Description: "+ NewTask.getDes() +" Created Date: "+ NewTask.isCStatus() +" Due Date: "+ NewTask.getDDate());
    }

    public void MarkAsCompleted(String name){
        Task NewTask = TaskMap.get(name);
        NewTask.setCStatus(true);
    }
    public void DeleteTask(String name){
        TaskMap.remove(name);
    }

}
