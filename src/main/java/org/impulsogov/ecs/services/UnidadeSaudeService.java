package org.impulsogov.ecs.services;

import org.impulsogov.ecs.mappers.UnidadeSaudeRowMapper;
import org.impulsogov.ecs.models.UnidadeSaude;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeSaudeService {

    private JdbcTemplate jdbcTemplate;

    private final String SQL_GET_ALL = "select * from dim_unidade_saude";

    private final String SQL_INSERT = "insert into dim_unidade_saude(ibge_origem, id_origem, cnes, nome, nome_filtro, bairro_nome, registro_valido) values(?,?,?,?,?,?,?)";

    public UnidadeSaudeService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean save(UnidadeSaude unidadeSaude) {
        return jdbcTemplate.update(SQL_INSERT, unidadeSaude.getIbgeOrigem(), unidadeSaude.getIdOrigem(), unidadeSaude.getCnes(), unidadeSaude.getNome(), unidadeSaude.getNomeFiltro(),
                unidadeSaude.getBairroNome(), unidadeSaude.getRegistroValido()) > 0;
    }

    public List<UnidadeSaude> loadAll() {
        return jdbcTemplate.query(SQL_GET_ALL, new UnidadeSaudeRowMapper());
    }
}
