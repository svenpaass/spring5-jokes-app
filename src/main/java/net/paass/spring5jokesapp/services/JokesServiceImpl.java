package net.paass.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

  private ChuckNorrisQuotes chuckNorrisQuotes;

  public JokesServiceImpl() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getJoke() {
    return chuckNorrisQuotes.getRandomQuote();
  }
}
