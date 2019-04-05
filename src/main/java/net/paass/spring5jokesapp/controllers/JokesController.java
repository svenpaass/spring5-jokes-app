package net.paass.spring5jokesapp.controllers;

import net.paass.spring5jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

  JokesService jokesService;

  public JokesController(JokesService jokesService) {
    this.jokesService = jokesService;
  }

  @GetMapping({ "", "/" })
  public String getRandomQuote(Model model) {
    model.addAttribute("joke", jokesService.getJoke());
    return "chucknorris";
  }

}
