package StanfordNLPSample;

//SentenceSentiment.java
public class SentenceSentiment 
{
public static void main(String[] args) 
{
             String text = "This is an excellent book. I enjoy reading it. I can read on Sundays. Today is only Tuesday. Can't wait for next Sunday. The working week is unbearably long. It's awful.";

  nlpPipeline.init();
  nlpPipeline.estimatingSentiment(text);
}
}
