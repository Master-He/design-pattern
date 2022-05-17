package org.github.hwj.abstractfactory;

public interface ProductFactory {
    Phone generatePhone();
    Router generateRouter();
    Computer generateComputer();
}
