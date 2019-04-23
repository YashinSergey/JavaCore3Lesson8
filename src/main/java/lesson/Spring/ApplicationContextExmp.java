package lesson.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *      Инверсия управления -  архитектурное решение интеграции, упрощающее расширение возможностей системы,
 * при котором поток управления программы контролируется фреймворком
 *      Внедрение зависимостей - процесс предоставления внешней зависимости программному компоненту. Является
 * специфичной формой «инверсии управления» (англ. Inversion of control, IoC),
 * когда она применяется к управлению зависимостями. В полном соответствии с принципом единственной
 * ответственности объект отдаёт заботу о построении требуемых ему зависимостей внешнему,
 * специально предназначенному для этого общему механизму.
 */

public class ApplicationContextExmp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Camera cameraC = context.getBean("cameraC", Camera.class);
        cameraC.doColorPhotograph();

        Camera cameraBW = context.getBean("cameraBW", Camera.class);
        cameraBW.doBWPhotograph();
    }
}
