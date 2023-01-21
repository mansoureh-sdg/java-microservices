package ir.sadeghi.emulator.bank.domain.valueobject;


public interface Mapper<T, E> {

    public E mapEntityToDTO(T t);

    public T mapDTOToEntity(E e);
}
