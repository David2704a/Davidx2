package fachada;

public class BitrateReader {

	public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: Archivo de lectura...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: Escribiendo archivo...");
        return buffer;
    }
}
