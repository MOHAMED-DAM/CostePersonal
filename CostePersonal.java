public class CostePersonal {

	static float CosteDelPersonal(Trabajador trabajadores[]) {
		float costeFinal = 0;
		Trabajador trabajador;
		for (int i = 0; y < trabajadores.length; i++) {
			trabajador = trabajadores[i];
			if (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR|| trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {
					costeFinal += trabajador.getNomina();
			}
			else
			{
				costeFinal += trabajador.getNomina() + (trabajador.getHorasExtras() * 20);
			}
		}
		return costeFinal;
	}
}
