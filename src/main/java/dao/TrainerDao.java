package dao;

import java.util.List;
import model.Trainer;

public interface TrainerDao {
	public void addTrainer(Trainer trainer);
	public void updateTrainer(Trainer trainer);
	public List<Trainer> listTrainers();
	public Trainer getTrainer(int id);
	public void deleteTrainer(Trainer trainer);
}