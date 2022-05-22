package org.github.hwj.struct.combination;

public class Client {
    /**
     * 组合模式就是将一组相似对象抽象成一类对象，然后按照树形结构进行组合
     */
    public static void main(String[] args) {

        Menu menuManagement = new Menu("菜单管理", 2);
        menuManagement.add(new MenuItem("页面访问", 3));
        menuManagement.add(new MenuItem("展开菜单", 3));
        menuManagement.add(new MenuItem("编辑菜单", 3));
        menuManagement.add(new MenuItem("删除菜单", 3));
        menuManagement.add(new MenuItem("新增菜单", 3));

        Menu accessConfiguration = new Menu("权限管理", 2);
        accessConfiguration.add(new MenuItem("页面访问", 3));
        accessConfiguration.add(new MenuItem("提交保存", 3));

        Menu roleManagement = new Menu("角色管理", 2);
        roleManagement.add(new MenuItem("新增角色", 3));
        roleManagement.add(new MenuItem("修改角色", 3));
        roleManagement.add(new MenuItem("删除角色", 3));

        Menu systemManagement = new Menu("系统管理", 1);
        systemManagement.add(menuManagement);
        systemManagement.add(accessConfiguration);
        systemManagement.add(roleManagement);

        systemManagement.print();
    }
}
