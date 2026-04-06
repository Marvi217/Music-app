class AudioAnalyzeRequest:
    blob_path: str

class AudioAnalyzeResponse:
    bpm: int
    energy_score: float
    valence_score: float
    acousticness: float