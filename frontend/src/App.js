import React, { useState } from 'react';
import axios from 'axios';
import "./Styles.css";

function App() {
  const [a, setA] = useState(0);
  const [b, setB] = useState(0);
  const [result, setResult] = useState(null);

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('http://localhost:8080/api/add', null, {
        params: { a, b }
      });
      setResult(response.data);
    } catch (error) {
      console.error('Error:', error);
    }
  };

  return (
    <div className="App">
      <h1>Simple Math</h1>
      <form onSubmit={handleSubmit}>
        <div className="input-group">
          <label>
            Value A:
            <div className='gap'>
              <input
                type="number"
                value={a}
                onChange={(e) => setA(parseInt(e.target.value))}
                />
            </div>
          </label>
        </div>
        <br />
        <div className="input-group">
          <label>
            Value B:
            <div className='gap'>
              <input
                type="number"
                value={b}
                onChange={(e) => setB(parseInt(e.target.value))}
                />
            </div>
          </label>
        </div>
        <br />
        <button type="submit">Add</button>
      </form>
      {result !== null && <h2>Result: {result}</h2>}
    </div>
  );
}

export default App;