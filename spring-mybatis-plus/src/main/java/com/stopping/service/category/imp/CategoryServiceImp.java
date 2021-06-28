package com.stopping.service.category.imp;

import com.stopping.model.domain.Category;
import com.stopping.mapper.category.CategoryMapper;
import com.stopping.service.category.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stopping
 * @since 2021-06-28
 */
@Service
public class CategoryServiceImp extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
