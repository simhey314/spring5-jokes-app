package guru.springframework.joke.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

	private ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeServiceImpl(final ChuckNorrisQuotes chuckNorrisQuotes) {
		System.out.println("Init joke Service, chuck norris quotes: " + chuckNorrisQuotes);
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
