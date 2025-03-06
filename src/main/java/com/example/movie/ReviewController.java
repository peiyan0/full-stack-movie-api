package com.example.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
@CrossOrigin(origins = "*")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }
    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
        Review review = reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId"));
        movieService.addReviewToMovie(payload.get("imdbId"), review);
        return new ResponseEntity<>(review, HttpStatus.OK);
    }

}
