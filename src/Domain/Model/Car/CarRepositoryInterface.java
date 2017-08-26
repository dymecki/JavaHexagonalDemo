package Domain.Model.Car;

import Domain.Common.Uuid;

public interface CarRepositoryInterface
{
    public void save(Car car);

    public Car findById(Uuid carId) throws Exception;

    public void remove(Car car);
}
