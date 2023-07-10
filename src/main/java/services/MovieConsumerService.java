package services;


import dtos.MovieConsumerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@FeignClient(name = "MovieService", url = "http://localhost:5000", path = "/api/v1/movie")
public interface MovieConsumerService {
    @GetMapping("/findAll")
    List<MovieConsumerDTO> findAllMovies(@RequestParam MovieConsumerDTO movieConsumerDTO);

}
