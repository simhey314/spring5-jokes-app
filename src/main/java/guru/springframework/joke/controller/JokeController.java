package guru.springframework.joke.controller;

import guru.springframework.joke.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

	private JokeService jokeService;

	public JokeController(final JokeService jokeService) {
		this.jokeService = jokeService;
	}

	@GetMapping({"/", ""})
	public String showJoke(final Model model) {

		model.addAttribute("joke", jokeService.getJoke());
		return "chucknorris";
	}
}
