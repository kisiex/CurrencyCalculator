package pl.parser.nbp.parser;

public interface Parser<Input, Output> {

    Output parse(Input input);

}
