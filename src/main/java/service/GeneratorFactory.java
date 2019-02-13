package service;

import fibonacci.FibonacciFactory;
import fibonacci.FibonacciType;
import silnia.SilniaFactory;
import silnia.SilniaType;

public class GeneratorFactory {
    public static Generator produce (GeneratorType generatorType, AlgorithmType algorithmType){

          if (GeneratorType.FIBONACCI.equals(generatorType)){
              FibonacciType fibonacciType = FibonacciType.valueOf(algorithmType.name());
              return FibonacciFactory.produce(fibonacciType);
          }
          if (GeneratorType.SILNIA.equals(generatorType)){
              SilniaType silniaType = SilniaType.valueOf(algorithmType.name());
              return SilniaFactory.produce(silniaType);
          }


        return null;
    }



}
