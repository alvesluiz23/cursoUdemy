package ExercicioDeFixacaoJavaException.model.exception;

public class BalanceException extends Exception{

    private static final long serialVersionUID = 1l;

    public BalanceException(String msg){
        super(msg);
    }
}
