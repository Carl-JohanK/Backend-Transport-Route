package org.example.routes.repository;

import org.example.routes.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

    List<Route> findRoutesByStartAndEnd(String start, String end);
    //List<Route> findRoutesByStartAndEndAndOrderByTime(String start, String end);

    //find all conecting routes
    List<Route> findRoutesByStart(String start);
    List<Route> findRoutesByEnd(String end);
    Route findRouteById(long id);


}
