package org.impulsogov.ecs.mappers;

import org.impulsogov.ecs.models.UnidadeSaude;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UnidadeSaudeRowMapper implements RowMapper<UnidadeSaude> {

    @Override
    public UnidadeSaude mapRow(ResultSet rs, int rowNum) throws SQLException {
        UnidadeSaude unidadeSaude = new UnidadeSaude();
        unidadeSaude.setId(rs.getString("id"));
        unidadeSaude.setIbgeOrigem(rs.getString("ibge_origem"));
        unidadeSaude.setIdOrigem(rs.getLong("id_origem"));
        unidadeSaude.setCnes(rs.getString("cnes"));
        unidadeSaude.setNome(rs.getString("nome"));
        unidadeSaude.setNomeFiltro(rs.getString("nome_filtro"));
        unidadeSaude.setBairroNome(rs.getString("bairro_nome"));
        unidadeSaude.setRegistroValido(rs.getBoolean("registro_valido"));

        return unidadeSaude;
    }
}
