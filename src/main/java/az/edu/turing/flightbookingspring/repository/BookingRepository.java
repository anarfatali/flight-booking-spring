package az.edu.turing.flightbookingspring.repository;


import az.edu.turing.flightbookingspring.entities.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {

}
