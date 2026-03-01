package dev.trinsdar.genetics.api;

import dev.trinsdar.genetics.api.acclimatiser.IAcclimatiserManager;
import dev.trinsdar.genetics.api.analyst.IAnalystManager;

import javax.annotation.Nullable;

public class GeneticsApi {
	@Nullable
	public static IAcclimatiserManager acclimatiserManager;

	@Nullable
	public static IAnalystManager analystManager;
}
