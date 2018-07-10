package com.humin.condition;

import com.humin.bean.Blue;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:07/07/201811:29 PM
 */
// 自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {
    /**
     * Select and return the names of which class(es) should be imported based on
     * the {@link AnnotationMetadata} of the importing @{@link Configuration} class.
     *
     * @param importingClassMetadata
     *
     * 返回值，就是到导入到容器中的组件全类名
     * AnnotationMetadata：当前标注@Import注解的类的所有注解信息
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {


        return new String[]{"com.humin.bean.Blue","com.humin.bean.Yellow"};
    }
}
