package org.github.hwj.create.abstractfactory;

public interface ProductFactory {
    Phone generatePhone();
    Router generateRouter();
    Computer generateComputer();
}
