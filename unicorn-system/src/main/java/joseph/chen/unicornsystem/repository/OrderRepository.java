package joseph.chen.unicornsystem.repository;

import joseph.chen.unicornsystem.domain.dto.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
