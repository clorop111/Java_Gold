package ex34;

  public class Test {
    public synchronized void execute(Sample...samples) {
      for (int i = 0; i < 10; i++) {
        while (!samples[0].hello(this)) {
          //
        }
        while (!samples[1].hello(this)) {
          //
        }
        samples[1].bye();
        samples[0].bye();
      }
    }
  }
