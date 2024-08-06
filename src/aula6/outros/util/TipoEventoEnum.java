package aula6.outros.util;

import java.util.HashMap;
import java.util.Map;

public enum TipoEventoEnum {
	SOCIAL(1),
	LAZER(2),
	PROFISSIONAL(3),
	OUTROS(4);

	private int id;
	private static final Map<Integer, TipoEventoEnum> dictTipos = new HashMap<>();

	static {
		for (TipoEventoEnum t : TipoEventoEnum.values()) {
			dictTipos.put(t.getId(), t);
		}
	}

	public static TipoEventoEnum getPorId(int id) {
        return dictTipos.get(id);
    }
	
	private TipoEventoEnum(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
