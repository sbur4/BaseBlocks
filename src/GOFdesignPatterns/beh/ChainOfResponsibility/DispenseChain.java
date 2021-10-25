package GOFdesignPatterns.beh.ChainOfResponsibility;

/**
 * Цепочка обязанностей — это поведенческий паттерн проектирования, который позволяет передавать
 * запросы последовательно по цепочке обработчиков. Каждый последующий обработчик решает, может ли он
 * обработать запрос сам и стоит ли передавать запрос дальше по цепи.
 */

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}