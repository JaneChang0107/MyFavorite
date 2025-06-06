import React, { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    fetch('/api/hello')
      .then(res => res.text())
      .then(setMessage);
  }, []);

  return (
    <div>
      <h1>前端 React</h1>
      <p>後端回傳：{message}</p>
    </div>
  );
}

export default App;
