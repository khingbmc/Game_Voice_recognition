package model;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger; //Logger is libary to useful to check Log in JAVA

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Port;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.result.WordResult;

public class SpeechMain {
	private LiveSpeechRecognizer recognizer; //reconizer
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	private String result; //result word for speech
	
	private boolean ignoreSpeechResult = false;
	
	private boolean speechRecognizerThreadRunning = false;//check sppech recognizer is running
	
	private boolean resourceThreadRunning = false;
	
	private ExecutorService eventsExecutorService = Executors.newFixedThreadPool(2);
	//to use manage state in order
	
	//constructor
	public SpeechMain() {
		
		logger.log(Level.INFO, "Loading Speech Recognizer...\n");
		Configuration config = new Configuration();
		
		//load model jar
		config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		config.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		
		//load grammar
		config.setGrammarPath("resource:/grammars");
		config.setGrammarName("grammar");
		config.setUseGrammar(true);
		
		try {
			this.recognizer = new LiveSpeechRecognizer(config);
		}catch(IOException ex) {
			this.logger.log(Level.SEVERE, null, ex);
		}
		
	}
	
	public synchronized void startSpeechRec() {
		//check recognizer is run
		if(this.speechRecognizerThreadRunning) {
			logger.log(Level.INFO, "Speech Recognition Thread already running...\n");
		}else {
			this.eventsExecutorService.submit(() -> {
				this.speechRecognizerThreadRunning = true;
				this.ignoreSpeechResult = false;
				
			});
		}
	}
}
