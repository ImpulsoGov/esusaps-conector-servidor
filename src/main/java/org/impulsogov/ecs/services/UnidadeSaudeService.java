package org.impulsogov.ecs.services;

import org.impulsogov.ecs.mapper.UnidadeSaudeRowMapper;
import org.impulsogov.ecs.models.UnidadeSaude;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeSaudeService {

    private JdbcTemplate jdbcTemplate;

    private final String SQL_GET_ALL = "select * from dim_unidade_saude";

    public UnidadeSaudeService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public UnidadeSaude save(UnidadeSaude unidadeSaude) {
        return null;
    }

    public List<UnidadeSaude> loadAll() {
        return jdbcTemplate.query(SQL_GET_ALL, new UnidadeSaudeRowMapper());
    }
}
