package pl.pamsoft.ebs.repositories;

import pl.pamsoft.ebs.model.Task;

public interface TaskRepository extends BaseRepository<Task> {

	Task getByName(String name);

}
