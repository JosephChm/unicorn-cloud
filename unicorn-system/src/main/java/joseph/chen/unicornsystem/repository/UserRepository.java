package joseph.chen.unicornsystem.repository;

import joseph.chen.unicornsystem.domain.dto.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserName(String userName);

}
