package task_2;


/**
 * Абстрактная фабрика, декларирует, какие стулья стулья будут производиться на фабрике
 */
public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
