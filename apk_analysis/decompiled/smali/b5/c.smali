.class public final Lb5/c;
.super Lb5/D1;
.source "SourceFile"


# instance fields
.field public d:Ljava/lang/String;

.field public e:Ljava/util/HashSet;

.field public f:Ls/e;

.field public g:Ljava/lang/Long;

.field public h:Ljava/lang/Long;


# virtual methods
.method public final o0()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final p0(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/ArrayList;
    .locals 40

    move-object/from16 v1, p0

    .line 1
    const-string v8, "current_results"

    invoke-static/range {p1 .. p1}, LF4/y;->e(Ljava/lang/String;)V

    .line 2
    invoke-static/range {p2 .. p2}, LF4/y;->h(Ljava/lang/Object;)V

    .line 3
    invoke-static/range {p3 .. p3}, LF4/y;->h(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iput-object v0, v1, Lb5/c;->d:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    .line 4
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, v1, Lb5/c;->e:Ljava/util/HashSet;

    .line 5
    new-instance v0, Ls/e;

    invoke-direct {v0}, Ls/e;-><init>()V

    iput-object v0, v1, Lb5/c;->f:Ls/e;

    move-object/from16 v0, p4

    iput-object v0, v1, Lb5/c;->g:Ljava/lang/Long;

    move-object/from16 v0, p5

    iput-object v0, v1, Lb5/c;->h:Ljava/lang/Long;

    .line 6
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v10, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/V0;

    .line 7
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/V0;->t()Ljava/lang/String;

    move-result-object v2

    const-string v3, "_s"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v10

    .line 8
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/j3;->a()V

    .line 9
    iget-object v0, v1, LD/n;->a:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Lb5/n0;

    iget-object v0, v11, Lb5/n0;->g:Lb5/g;

    .line 10
    iget-object v3, v1, Lb5/c;->d:Ljava/lang/String;

    .line 11
    sget-object v4, Lb5/E;->F0:Lb5/D;

    .line 12
    invoke-virtual {v0, v3, v4}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    move-result v12

    .line 13
    invoke-static {}, Lcom/google/android/gms/internal/measurement/j3;->a()V

    .line 14
    iget-object v0, v1, Lb5/c;->d:Ljava/lang/String;

    sget-object v3, Lb5/E;->E0:Lb5/D;

    .line 15
    iget-object v4, v11, Lb5/n0;->g:Lb5/g;

    invoke-virtual {v4, v0, v3}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    move-result v13

    const-string v14, "events"

    iget-object v15, v1, Lb5/z1;->b:Lb5/J1;

    if-eqz v2, :cond_2

    .line 16
    invoke-virtual {v15}, Lb5/J1;->i0()Lb5/n;

    move-result-object v3

    iget-object v4, v1, Lb5/c;->d:Ljava/lang/String;

    .line 17
    invoke-virtual {v3}, Lb5/D1;->m0()V

    .line 18
    invoke-virtual {v3}, LD/n;->l0()V

    .line 19
    invoke-static {v4}, LF4/y;->e(Ljava/lang/String;)V

    new-instance v0, Landroid/content/ContentValues;

    .line 20
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 21
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "current_session_count"

    invoke-virtual {v0, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 22
    :try_start_0
    invoke-virtual {v3}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    const-string v6, "app_id = ?"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v7

    .line 23
    invoke-virtual {v5, v14, v0, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 24
    iget-object v3, v3, LD/n;->a:Ljava/lang/Object;

    check-cast v3, Lb5/n0;

    .line 25
    invoke-virtual {v3}, Lb5/n0;->A()Lb5/V;

    move-result-object v3

    .line 26
    invoke-virtual {v3}, Lb5/V;->q0()Lb5/T;

    move-result-object v3

    invoke-static {v4}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v4

    const-string v5, "Error resetting session-scoped event counts. appId"

    .line 27
    invoke-virtual {v3, v4, v0, v5}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    :cond_2
    :goto_1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string v3, "Failed to merge filter. appId"

    const-string v4, "Database error querying filters. appId"

    const-string v5, "data"

    const-string v6, "audience_id"

    if-eqz v13, :cond_9

    if-eqz v12, :cond_9

    .line 29
    invoke-virtual {v15}, Lb5/J1;->i0()Lb5/n;

    move-result-object v7

    iget-object v10, v7, LD/n;->a:Ljava/lang/Object;

    check-cast v10, Lb5/n0;

    iget-object v9, v1, Lb5/c;->d:Ljava/lang/String;

    .line 30
    invoke-static {v9}, LF4/y;->e(Ljava/lang/String;)V

    move/from16 p4, v2

    new-instance v2, Ls/e;

    .line 31
    invoke-direct {v2}, Ls/e;-><init>()V

    .line 32
    invoke-virtual {v7}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v17

    :try_start_1
    const-string v18, "event_filters"

    filled-new-array {v6, v5}, [Ljava/lang/String;

    move-result-object v19

    const-string v20, "app_id=?"

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v21

    const/16 v24, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    .line 33
    invoke-virtual/range {v17 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 34
    :try_start_2
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v17
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v17, :cond_6

    move-object/from16 p5, v5

    :goto_2
    const/4 v5, 0x1

    .line 35
    :try_start_3
    invoke-interface {v7, v5}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 36
    :try_start_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/o0;->p()Lcom/google/android/gms/internal/measurement/n0;

    move-result-object v5

    invoke-static {v5, v0}, Lb5/Z;->R0(Lcom/google/android/gms/internal/measurement/a2;[B)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/n0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->h()Lcom/google/android/gms/internal/measurement/b2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o0;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 37
    :try_start_5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o0;->z()Z

    move-result v5

    if-nez v5, :cond_3

    move-object/from16 v18, v7

    goto :goto_5

    :cond_3
    const/4 v5, 0x0

    .line 38
    invoke-interface {v7, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v17

    .line 39
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v2, v5}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/util/List;
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-nez v17, :cond_4

    move-object/from16 v18, v7

    :try_start_6
    new-instance v7, Ljava/util/ArrayList;

    .line 40
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 41
    invoke-virtual {v2, v5, v7}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_8

    :cond_4
    move-object/from16 v18, v7

    move-object/from16 v7, v17

    .line 42
    :goto_3
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object/from16 v18, v7

    goto :goto_7

    :catch_2
    move-exception v0

    :goto_4
    move-object/from16 v18, v7

    goto :goto_8

    :catch_3
    move-exception v0

    move-object/from16 v18, v7

    .line 43
    invoke-virtual {v10}, Lb5/n0;->A()Lb5/V;

    move-result-object v5

    .line 44
    invoke-virtual {v5}, Lb5/V;->q0()Lb5/T;

    move-result-object v5

    invoke-static {v9}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v7

    .line 45
    invoke-virtual {v5, v7, v0, v3}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    :goto_5
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-nez v0, :cond_5

    .line 47
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->close()V

    move-object v9, v2

    goto :goto_d

    :cond_5
    move-object/from16 v7, v18

    goto :goto_2

    :cond_6
    move-object/from16 p5, v5

    move-object/from16 v18, v7

    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->close()V

    :cond_7
    :goto_6
    move-object v9, v0

    goto :goto_d

    :goto_7
    move-object/from16 v7, v18

    goto :goto_c

    :catch_4
    move-exception v0

    move-object/from16 p5, v5

    goto :goto_4

    :goto_8
    move-object/from16 v7, v18

    goto :goto_b

    :catchall_2
    move-exception v0

    goto :goto_9

    :catch_5
    move-exception v0

    move-object/from16 p5, v5

    goto :goto_a

    :goto_9
    const/4 v7, 0x0

    goto :goto_c

    :goto_a
    const/4 v7, 0x0

    .line 48
    :goto_b
    :try_start_7
    invoke-virtual {v10}, Lb5/n0;->A()Lb5/V;

    move-result-object v2

    .line 49
    invoke-virtual {v2}, Lb5/V;->q0()Lb5/T;

    move-result-object v2

    invoke-static {v9}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v5

    .line 50
    invoke-virtual {v2, v5, v0, v4}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    if-eqz v7, :cond_7

    .line 52
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_6

    :catchall_3
    move-exception v0

    :goto_c
    if-eqz v7, :cond_8

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 53
    :cond_8
    throw v0

    :cond_9
    move/from16 p4, v2

    move-object/from16 p5, v5

    goto :goto_6

    .line 54
    :goto_d
    invoke-virtual {v15}, Lb5/J1;->i0()Lb5/n;

    move-result-object v0

    iget-object v2, v0, LD/n;->a:Ljava/lang/Object;

    check-cast v2, Lb5/n0;

    iget-object v5, v1, Lb5/c;->d:Ljava/lang/String;

    .line 55
    invoke-virtual {v0}, Lb5/D1;->m0()V

    .line 56
    invoke-virtual {v0}, LD/n;->l0()V

    .line 57
    invoke-static {v5}, LF4/y;->e(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v0}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v17

    :try_start_8
    const-string v18, "audience_filter_values"

    filled-new-array {v6, v8}, [Ljava/lang/String;

    move-result-object v19

    const-string v20, "app_id=?"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v21

    const/16 v24, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    .line 59
    invoke-virtual/range {v17 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_c
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 60
    :try_start_9
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_a

    .line 61
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 62
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    move-object v10, v0

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    goto/16 :goto_17

    :catch_6
    move-exception v0

    move-object/from16 v17, v2

    :goto_e
    move-object/from16 v19, v3

    :goto_f
    move-object/from16 v20, v4

    :goto_10
    move-object/from16 v21, v5

    goto/16 :goto_16

    .line 63
    :cond_a
    :try_start_a
    new-instance v10, Ls/e;

    .line 64
    invoke-direct {v10}, Ls/e;-><init>()V
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    move-object/from16 v17, v2

    :goto_11
    const/4 v2, 0x0

    .line 65
    :try_start_b
    invoke-interface {v7, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v18

    const/4 v2, 0x1

    .line 66
    invoke-interface {v7, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 67
    :try_start_c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/g1;->r()Lcom/google/android/gms/internal/measurement/f1;

    move-result-object v2

    invoke-static {v2, v0}, Lb5/Z;->R0(Lcom/google/android/gms/internal/measurement/a2;[B)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/f1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->h()Lcom/google/android/gms/internal/measurement/b2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/g1;
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_7
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 68
    :try_start_d
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v10, v2, v0}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    goto :goto_13

    :catch_7
    move-exception v0

    goto :goto_e

    :catch_8
    move-exception v0

    goto :goto_12

    :catchall_4
    move-exception v0

    goto/16 :goto_60

    .line 69
    :goto_12
    invoke-virtual/range {v17 .. v17}, Lb5/n0;->A()Lb5/V;

    move-result-object v2

    .line 70
    invoke-virtual {v2}, Lb5/V;->q0()Lb5/T;

    move-result-object v2
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    move-object/from16 v19, v3

    :try_start_e
    const-string v3, "Failed to merge filter results. appId, audienceId, error"
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_b
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    move-object/from16 v20, v4

    :try_start_f
    invoke-static {v5}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v4
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_a
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    move-object/from16 v21, v5

    .line 71
    :try_start_10
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 72
    invoke-virtual {v2, v3, v4, v5, v0}, Lb5/T;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    :goto_13
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_9
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    if-nez v0, :cond_b

    .line 74
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_17

    :cond_b
    move-object/from16 v3, v19

    move-object/from16 v4, v20

    move-object/from16 v5, v21

    goto :goto_11

    :catch_9
    move-exception v0

    goto :goto_16

    :catch_a
    move-exception v0

    goto :goto_10

    :catch_b
    move-exception v0

    goto :goto_f

    :catchall_5
    move-exception v0

    goto :goto_14

    :catch_c
    move-exception v0

    move-object/from16 v17, v2

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    goto :goto_15

    :goto_14
    const/4 v7, 0x0

    goto/16 :goto_60

    :goto_15
    const/4 v7, 0x0

    .line 75
    :goto_16
    :try_start_11
    invoke-virtual/range {v17 .. v17}, Lb5/n0;->A()Lb5/V;

    move-result-object v2

    .line 76
    invoke-virtual {v2}, Lb5/V;->q0()Lb5/T;

    move-result-object v2

    const-string v3, "Database error querying filter results. appId"

    invoke-static/range {v21 .. v21}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v4

    .line 77
    invoke-virtual {v2, v4, v0, v3}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    if-eqz v7, :cond_c

    .line 79
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_c
    move-object v10, v0

    .line 80
    :goto_17
    invoke-interface {v10}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    move-object v10, v6

    move-object/from16 v24, v11

    :goto_18
    move-object/from16 v9, p5

    move-object/from16 v12, v19

    move-object/from16 v11, v20

    goto/16 :goto_32

    .line 81
    :cond_d
    new-instance v2, Ljava/util/HashSet;

    .line 82
    invoke-interface {v10}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    if-eqz p4, :cond_1c

    iget-object v3, v1, Lb5/c;->d:Ljava/lang/String;

    .line 83
    invoke-virtual {v15}, Lb5/J1;->i0()Lb5/n;

    move-result-object v4

    iget-object v5, v1, Lb5/c;->d:Ljava/lang/String;

    .line 84
    invoke-virtual {v4}, Lb5/D1;->m0()V

    .line 85
    invoke-virtual {v4}, LD/n;->l0()V

    .line 86
    invoke-static {v5}, LF4/y;->e(Ljava/lang/String;)V

    new-instance v0, Ls/e;

    .line 87
    invoke-direct {v0}, Ls/e;-><init>()V

    .line 88
    invoke-virtual {v4}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v7

    move-object/from16 p4, v2

    :try_start_12
    const-string v2, "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_f
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    move-object/from16 v17, v3

    :try_start_13
    filled-new-array {v5, v5}, [Ljava/lang/String;

    move-result-object v3

    .line 89
    invoke-virtual {v7, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_e
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    .line 90
    :try_start_14
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_10

    :cond_e
    const/4 v3, 0x0

    .line 91
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    .line 92
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    if-nez v7, :cond_f

    new-instance v7, Ljava/util/ArrayList;

    .line 93
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 94
    invoke-virtual {v0, v3, v7}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    const/4 v3, 0x1

    goto :goto_19

    :catchall_6
    move-exception v0

    goto :goto_1b

    :catch_d
    move-exception v0

    goto :goto_1e

    .line 95
    :goto_19
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v18

    .line 96
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_d
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    if-nez v3, :cond_e

    .line 98
    :goto_1a
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_1f

    .line 99
    :cond_10
    :try_start_15
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_d
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    goto :goto_1a

    :goto_1b
    move-object v7, v2

    goto/16 :goto_26

    :catchall_7
    move-exception v0

    goto :goto_1c

    :catch_e
    move-exception v0

    goto :goto_1d

    :goto_1c
    const/4 v7, 0x0

    goto/16 :goto_26

    :catch_f
    move-exception v0

    move-object/from16 v17, v3

    :goto_1d
    const/4 v2, 0x0

    .line 100
    :goto_1e
    :try_start_16
    iget-object v3, v4, LD/n;->a:Ljava/lang/Object;

    check-cast v3, Lb5/n0;

    .line 101
    invoke-virtual {v3}, Lb5/n0;->A()Lb5/V;

    move-result-object v3

    .line 102
    invoke-virtual {v3}, Lb5/V;->q0()Lb5/T;

    move-result-object v3

    const-string v4, "Database error querying scoped filters. appId"

    invoke-static {v5}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v5

    .line 103
    invoke-virtual {v3, v5, v0, v4}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    if-eqz v2, :cond_11

    goto :goto_1a

    .line 105
    :cond_11
    :goto_1f
    invoke-static/range {v17 .. v17}, LF4/y;->e(Ljava/lang/String;)V

    .line 106
    new-instance v2, Ls/e;

    .line 107
    invoke-direct {v2}, Ls/e;-><init>()V

    .line 108
    invoke-interface {v10}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_13

    :cond_12
    move-object/from16 v18, v6

    move-object/from16 v24, v11

    goto/16 :goto_25

    .line 109
    :cond_13
    invoke-interface {v10}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_20
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    invoke-interface {v10, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/g1;

    .line 111
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    if-eqz v7, :cond_14

    .line 112
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v17

    if-eqz v17, :cond_15

    :cond_14
    move-object/from16 v17, v0

    move-object/from16 v21, v3

    move-object/from16 v18, v6

    move-object/from16 v24, v11

    goto/16 :goto_24

    :cond_15
    move-object/from16 v17, v0

    .line 113
    invoke-virtual {v15}, Lb5/J1;->a()Lb5/Z;

    move-result-object v0

    .line 114
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/g1;->u()Ljava/util/List;

    move-result-object v18

    move-object/from16 v21, v3

    move-object/from16 v3, v18

    check-cast v3, Lcom/google/android/gms/internal/measurement/g2;

    invoke-virtual {v0, v3, v7}, Lb5/Z;->U0(Lcom/google/android/gms/internal/measurement/g2;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 115
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1a

    .line 116
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/b2;->f()Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/f1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/f1;->l()V

    .line 117
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->j()V

    move-object/from16 v18, v6

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 118
    check-cast v6, Lcom/google/android/gms/internal/measurement/g1;

    invoke-static {v6, v0}, Lcom/google/android/gms/internal/measurement/g1;->y(Lcom/google/android/gms/internal/measurement/g1;Ljava/util/List;)V

    .line 119
    invoke-virtual {v15}, Lb5/J1;->a()Lb5/Z;

    move-result-object v0

    .line 120
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/g1;->w()Lcom/google/android/gms/internal/measurement/g2;

    move-result-object v6

    invoke-virtual {v0, v6, v7}, Lb5/Z;->U0(Lcom/google/android/gms/internal/measurement/g2;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 121
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/f1;->n()V

    .line 122
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->j()V

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 123
    check-cast v6, Lcom/google/android/gms/internal/measurement/g1;

    invoke-static {v6, v0}, Lcom/google/android/gms/internal/measurement/g1;->A(Lcom/google/android/gms/internal/measurement/g1;Ljava/util/List;)V

    .line 124
    new-instance v0, Ljava/util/ArrayList;

    .line 125
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 126
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/g1;->t()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_21
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_17

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v23, v6

    move-object/from16 v6, v22

    check-cast v6, Lcom/google/android/gms/internal/measurement/T0;

    .line 127
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/T0;->n()I

    move-result v22

    move-object/from16 v24, v11

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v7, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_16

    .line 128
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    move-object/from16 v6, v23

    move-object/from16 v11, v24

    goto :goto_21

    :cond_17
    move-object/from16 v24, v11

    .line 129
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/f1;->k()V

    .line 130
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->j()V

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 131
    check-cast v6, Lcom/google/android/gms/internal/measurement/g1;

    invoke-static {v6, v0}, Lcom/google/android/gms/internal/measurement/g1;->x(Lcom/google/android/gms/internal/measurement/g1;Ljava/util/ArrayList;)V

    .line 132
    new-instance v0, Ljava/util/ArrayList;

    .line 133
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 134
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/g1;->v()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_18
    :goto_22
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_19

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/i1;

    .line 135
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/i1;->o()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v7, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_18

    .line 136
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_22

    .line 137
    :cond_19
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/f1;->m()V

    .line 138
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->j()V

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 139
    check-cast v5, Lcom/google/android/gms/internal/measurement/g1;

    invoke-static {v5, v0}, Lcom/google/android/gms/internal/measurement/g1;->z(Lcom/google/android/gms/internal/measurement/g1;Ljava/util/List;)V

    .line 140
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->h()Lcom/google/android/gms/internal/measurement/b2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/g1;

    invoke-virtual {v2, v4, v0}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_23
    move-object/from16 v0, v17

    move-object/from16 v6, v18

    move-object/from16 v3, v21

    move-object/from16 v11, v24

    goto/16 :goto_20

    :cond_1a
    move-object/from16 v0, v17

    move-object/from16 v3, v21

    goto/16 :goto_20

    .line 141
    :goto_24
    invoke-virtual {v2, v4, v5}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_23

    :goto_25
    move-object v11, v2

    goto :goto_27

    :goto_26
    if-eqz v7, :cond_1b

    .line 142
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 143
    :cond_1b
    throw v0

    :cond_1c
    move-object/from16 p4, v2

    move-object/from16 v18, v6

    move-object/from16 v24, v11

    move-object v11, v10

    .line 144
    :goto_27
    invoke-virtual/range {p4 .. p4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_28
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2c

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/g1;

    new-instance v4, Ljava/util/BitSet;

    .line 146
    invoke-direct {v4}, Ljava/util/BitSet;-><init>()V

    new-instance v5, Ljava/util/BitSet;

    .line 147
    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    new-instance v6, Ls/e;

    .line 148
    invoke-direct {v6}, Ls/e;-><init>()V

    if-eqz v2, :cond_1d

    .line 149
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/g1;->n()I

    move-result v3

    if-nez v3, :cond_1e

    :cond_1d
    move-object/from16 p4, v2

    goto :goto_2b

    .line 150
    :cond_1e
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/g1;->t()Ljava/util/List;

    move-result-object v3

    .line 151
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1f
    :goto_29
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/T0;

    .line 152
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/T0;->t()Z

    move-result v21

    if-eqz v21, :cond_1f

    .line 153
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/T0;->n()I

    move-result v21

    move-object/from16 p4, v2

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 154
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/T0;->s()Z

    move-result v21

    if-eqz v21, :cond_20

    .line 155
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/T0;->o()J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2a

    :cond_20
    const/4 v7, 0x0

    .line 156
    :goto_2a
    invoke-virtual {v6, v2, v7}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, p4

    goto :goto_29

    .line 157
    :goto_2b
    new-instance v7, Ls/e;

    .line 158
    invoke-direct {v7}, Ls/e;-><init>()V

    if-eqz p4, :cond_21

    .line 159
    invoke-virtual/range {p4 .. p4}, Lcom/google/android/gms/internal/measurement/g1;->p()I

    move-result v2

    if-nez v2, :cond_22

    :cond_21
    move-object/from16 v23, v11

    goto :goto_2d

    .line 160
    :cond_22
    invoke-virtual/range {p4 .. p4}, Lcom/google/android/gms/internal/measurement/g1;->v()Ljava/util/List;

    move-result-object v2

    .line 161
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_23
    :goto_2c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/i1;

    .line 162
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/i1;->u()Z

    move-result v21

    if-eqz v21, :cond_23

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/i1;->n()I

    move-result v21

    if-lez v21, :cond_23

    .line 163
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/i1;->o()I

    move-result v21

    move-object/from16 v22, v2

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 164
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/i1;->n()I

    move-result v21

    move-object/from16 v23, v11

    add-int/lit8 v11, v21, -0x1

    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/measurement/i1;->p(I)J

    move-result-wide v25

    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 165
    invoke-virtual {v7, v2, v3}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v22

    move-object/from16 v11, v23

    goto :goto_2c

    :goto_2d
    if-eqz p4, :cond_26

    const/4 v2, 0x0

    .line 166
    :goto_2e
    invoke-virtual/range {p4 .. p4}, Lcom/google/android/gms/internal/measurement/g1;->q()I

    move-result v3

    mul-int/lit8 v3, v3, 0x40

    if-ge v2, v3, :cond_26

    invoke-virtual/range {p4 .. p4}, Lcom/google/android/gms/internal/measurement/g1;->w()Lcom/google/android/gms/internal/measurement/g2;

    move-result-object v3

    .line 167
    invoke-static {v3, v2}, Lb5/Z;->Z0(Lcom/google/android/gms/internal/measurement/g2;I)Z

    move-result v3

    if-eqz v3, :cond_24

    .line 168
    invoke-virtual/range {v24 .. v24}, Lb5/n0;->A()Lb5/V;

    move-result-object v3

    .line 169
    invoke-virtual {v3}, Lb5/V;->r0()Lb5/T;

    move-result-object v3

    .line 170
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    move/from16 v21, v12

    const-string v12, "Filter already evaluated. audience ID, filter ID"

    invoke-virtual {v3, v0, v11, v12}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    invoke-virtual {v5, v2}, Ljava/util/BitSet;->set(I)V

    invoke-virtual/range {p4 .. p4}, Lcom/google/android/gms/internal/measurement/g1;->u()Ljava/util/List;

    move-result-object v3

    .line 172
    check-cast v3, Lcom/google/android/gms/internal/measurement/g2;

    invoke-static {v3, v2}, Lb5/Z;->Z0(Lcom/google/android/gms/internal/measurement/g2;I)Z

    move-result v3

    if-eqz v3, :cond_25

    .line 173
    invoke-virtual {v4, v2}, Ljava/util/BitSet;->set(I)V

    goto :goto_2f

    :cond_24
    move/from16 v21, v12

    .line 174
    :cond_25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v6, v3}, Ls/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2f
    add-int/lit8 v2, v2, 0x1

    move/from16 v12, v21

    goto :goto_2e

    :cond_26
    move/from16 v21, v12

    .line 175
    invoke-interface {v10, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/google/android/gms/internal/measurement/g1;

    if-eqz v13, :cond_27

    if-eqz v21, :cond_27

    .line 176
    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_27

    iget-object v11, v1, Lb5/c;->h:Ljava/lang/Long;

    if-eqz v11, :cond_27

    iget-object v11, v1, Lb5/c;->g:Ljava/lang/Long;

    if-nez v11, :cond_28

    :cond_27
    move-object/from16 p4, v0

    goto :goto_31

    .line 177
    :cond_28
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_30
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_27

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/o0;

    .line 178
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/o0;->o()I

    move-result v12

    move-object/from16 p4, v0

    iget-object v0, v1, Lb5/c;->h:Ljava/lang/Long;

    .line 179
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v25

    const-wide/16 v27, 0x3e8

    div-long v25, v25, v27

    .line 180
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/o0;->x()Z

    move-result v0

    if-eqz v0, :cond_29

    iget-object v0, v1, Lb5/c;->g:Ljava/lang/Long;

    .line 181
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v25

    div-long v25, v25, v27

    .line 182
    :cond_29
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Ls/i;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2a

    .line 183
    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v6, v0, v11}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    :cond_2a
    invoke-virtual {v7, v0}, Ls/i;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2b

    .line 185
    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v7, v0, v11}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2b
    move-object/from16 v0, p4

    goto :goto_30

    .line 186
    :goto_31
    new-instance v0, Lb5/R1;

    iget-object v2, v1, Lb5/c;->d:Ljava/lang/String;

    move/from16 p1, v13

    move-object/from16 v13, p4

    move/from16 p4, p1

    move-object/from16 p1, v10

    move-object/from16 v10, v18

    move-object/from16 v12, v19

    move-object/from16 v11, v20

    move-object/from16 v19, v9

    move-object/from16 v9, p5

    .line 187
    invoke-direct/range {v0 .. v7}, Lb5/R1;-><init>(Lb5/c;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/g1;Ljava/util/BitSet;Ljava/util/BitSet;Ls/e;Ls/e;)V

    iget-object v2, v1, Lb5/c;->f:Ls/e;

    .line 188
    invoke-virtual {v2, v13, v0}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v13, p4

    move-object/from16 v9, v19

    move-object/from16 v11, v23

    move-object/from16 v10, p1

    move-object/from16 v19, v12

    move/from16 v12, v21

    goto/16 :goto_28

    :cond_2c
    move-object/from16 v10, v18

    goto/16 :goto_18

    .line 189
    :goto_32
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-string v6, "Skipping failed audience ID"

    if-eqz v0, :cond_2d

    goto/16 :goto_43

    .line 190
    :cond_2d
    new-instance v7, Lb5/W;

    invoke-direct {v7, v1}, Lb5/W;-><init>(Lb5/c;)V

    new-instance v13, Ls/e;

    .line 191
    invoke-direct {v13}, Ls/e;-><init>()V

    .line 192
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :cond_2e
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3a

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/V0;

    iget-object v2, v1, Lb5/c;->d:Ljava/lang/String;

    .line 193
    invoke-virtual {v7, v0, v2}, Lb5/W;->d(Lcom/google/android/gms/internal/measurement/V0;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/V0;

    move-result-object v28

    if-eqz v28, :cond_2e

    .line 194
    invoke-virtual {v15}, Lb5/J1;->i0()Lb5/n;

    move-result-object v2

    iget-object v3, v1, Lb5/c;->d:Ljava/lang/String;

    invoke-virtual/range {v28 .. v28}, Lcom/google/android/gms/internal/measurement/V0;->t()Ljava/lang/String;

    move-result-object v4

    .line 195
    invoke-virtual {v2, v3, v0, v4}, Lb5/n;->n1(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/V0;Ljava/lang/String;)Lb5/r;

    move-result-object v2

    .line 196
    invoke-virtual {v15}, Lb5/J1;->i0()Lb5/n;

    move-result-object v0

    .line 197
    invoke-virtual {v0, v14, v2}, Lb5/n;->S0(Ljava/lang/String;Lb5/r;)V

    if-nez p6, :cond_2e

    .line 198
    invoke-virtual/range {v28 .. v28}, Lcom/google/android/gms/internal/measurement/V0;->t()Ljava/lang/String;

    move-result-object v3

    .line 199
    invoke-virtual {v13, v3}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_34

    .line 200
    invoke-virtual {v15}, Lb5/J1;->i0()Lb5/n;

    move-result-object v0

    iget-object v4, v0, LD/n;->a:Ljava/lang/Object;

    check-cast v4, Lb5/n0;

    iget-object v5, v1, Lb5/c;->d:Ljava/lang/String;

    .line 201
    invoke-virtual {v0}, Lb5/D1;->m0()V

    .line 202
    invoke-virtual {v0}, LD/n;->l0()V

    .line 203
    invoke-static {v5}, LF4/y;->e(Ljava/lang/String;)V

    .line 204
    invoke-static {v3}, LF4/y;->e(Ljava/lang/String;)V

    move-object/from16 v31, v2

    new-instance v2, Ls/e;

    .line 205
    invoke-direct {v2}, Ls/e;-><init>()V

    .line 206
    invoke-virtual {v0}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v32

    :try_start_17
    const-string v33, "event_filters"

    filled-new-array {v10, v9}, [Ljava/lang/String;

    move-result-object v34

    const-string v35, "app_id=? AND event_name=?"

    filled-new-array {v5, v3}, [Ljava/lang/String;

    move-result-object v36
    :try_end_17
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_17 .. :try_end_17} :catch_15
    .catchall {:try_start_17 .. :try_end_17} :catchall_a

    const/16 v39, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    move-object/from16 p1, v4

    .line 207
    :try_start_18
    invoke-virtual/range {v32 .. v39}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4
    :try_end_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_18 .. :try_end_18} :catch_14
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    .line 208
    :try_start_19
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0
    :try_end_19
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_19 .. :try_end_19} :catch_13
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    if-eqz v0, :cond_31

    move-object/from16 v19, v5

    :goto_33
    const/4 v5, 0x1

    .line 209
    :try_start_1a
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0
    :try_end_1a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1a .. :try_end_1a} :catch_11
    .catchall {:try_start_1a .. :try_end_1a} :catchall_9

    .line 210
    :try_start_1b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/o0;->p()Lcom/google/android/gms/internal/measurement/n0;

    move-result-object v5

    invoke-static {v5, v0}, Lb5/Z;->R0(Lcom/google/android/gms/internal/measurement/a2;[B)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/n0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->h()Lcom/google/android/gms/internal/measurement/b2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o0;
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1b .. :try_end_1b} :catch_11
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    const/4 v5, 0x0

    .line 211
    :try_start_1c
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v20

    .line 212
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v2, v5}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Ljava/util/List;
    :try_end_1c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1c .. :try_end_1c} :catch_11
    .catchall {:try_start_1c .. :try_end_1c} :catchall_9

    if-nez v20, :cond_2f

    move-object/from16 p2, v4

    :try_start_1d
    new-instance v4, Ljava/util/ArrayList;

    .line 213
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 214
    invoke-virtual {v2, v5, v4}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_34

    :catchall_8
    move-exception v0

    goto :goto_36

    :catch_10
    move-exception v0

    goto :goto_37

    :cond_2f
    move-object/from16 p2, v4

    move-object/from16 v4, v20

    .line 215
    :goto_34
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_35

    :catchall_9
    move-exception v0

    move-object/from16 p2, v4

    goto :goto_36

    :catch_11
    move-exception v0

    move-object/from16 p2, v4

    goto :goto_37

    :catch_12
    move-exception v0

    move-object/from16 p2, v4

    .line 216
    invoke-virtual/range {p1 .. p1}, Lb5/n0;->A()Lb5/V;

    move-result-object v4

    .line 217
    invoke-virtual {v4}, Lb5/V;->q0()Lb5/T;

    move-result-object v4

    invoke-static/range {v19 .. v19}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v5

    .line 218
    invoke-virtual {v4, v5, v0, v12}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    :goto_35
    invoke-interface/range {p2 .. p2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_1d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1d .. :try_end_1d} :catch_10
    .catchall {:try_start_1d .. :try_end_1d} :catchall_8

    if-nez v0, :cond_30

    .line 220
    invoke-interface/range {p2 .. p2}, Landroid/database/Cursor;->close()V

    move-object v0, v2

    goto :goto_3c

    :cond_30
    move-object/from16 v4, p2

    goto :goto_33

    :cond_31
    move-object/from16 p2, v4

    move-object/from16 v19, v5

    .line 221
    :try_start_1e
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_1e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1e .. :try_end_1e} :catch_10
    .catchall {:try_start_1e .. :try_end_1e} :catchall_8

    .line 222
    invoke-interface/range {p2 .. p2}, Landroid/database/Cursor;->close()V

    goto :goto_3c

    :goto_36
    move-object/from16 v7, p2

    goto :goto_3d

    :catch_13
    move-exception v0

    move-object/from16 p2, v4

    move-object/from16 v19, v5

    :goto_37
    move-object/from16 v2, p2

    goto :goto_3b

    :catchall_a
    move-exception v0

    goto :goto_39

    :catch_14
    move-exception v0

    :goto_38
    move-object/from16 v19, v5

    goto :goto_3a

    :catch_15
    move-exception v0

    move-object/from16 p1, v4

    goto :goto_38

    :goto_39
    const/4 v7, 0x0

    goto :goto_3d

    :goto_3a
    const/4 v2, 0x0

    .line 223
    :goto_3b
    :try_start_1f
    invoke-virtual/range {p1 .. p1}, Lb5/n0;->A()Lb5/V;

    move-result-object v4

    .line 224
    invoke-virtual {v4}, Lb5/V;->q0()Lb5/T;

    move-result-object v4

    invoke-static/range {v19 .. v19}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v5

    .line 225
    invoke-virtual {v4, v5, v0, v11}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_b

    if-eqz v2, :cond_32

    .line 227
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 228
    :cond_32
    :goto_3c
    invoke-virtual {v13, v3, v0}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3e

    :catchall_b
    move-exception v0

    move-object v7, v2

    :goto_3d
    if-eqz v7, :cond_33

    .line 229
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 230
    :cond_33
    throw v0

    :cond_34
    move-object/from16 v31, v2

    .line 231
    :goto_3e
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_3f
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2e

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, v1, Lb5/c;->e:Ljava/util/HashSet;

    .line 232
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_35

    .line 233
    invoke-virtual/range {v24 .. v24}, Lb5/n0;->A()Lb5/V;

    move-result-object v3

    .line 234
    invoke-virtual {v3}, Lb5/V;->r0()Lb5/T;

    move-result-object v3

    invoke-virtual {v3, v2, v6}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3f

    .line 235
    :cond_35
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 236
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v20

    const/4 v5, 0x1

    :goto_40
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_38

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/o0;

    new-instance v25, Lb5/b;

    move-object v5, v2

    iget-object v2, v1, Lb5/c;->d:Ljava/lang/String;

    move-object/from16 v21, v5

    const/4 v5, 0x0

    move-object/from16 p1, v7

    move-object/from16 v22, v12

    move-object/from16 v12, v21

    move-object/from16 v7, v31

    move-object/from16 v21, v0

    move-object/from16 v0, v25

    invoke-direct/range {v0 .. v5}, Lb5/b;-><init>(Lb5/c;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/b2;I)V

    iget-object v0, v1, Lb5/c;->g:Ljava/lang/Long;

    iget-object v2, v1, Lb5/c;->h:Ljava/lang/Long;

    .line 237
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/o0;->o()I

    move-result v4

    .line 238
    iget-object v5, v1, Lb5/c;->f:Ls/e;

    invoke-virtual {v5, v12}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb5/R1;

    if-nez v5, :cond_36

    const/16 v32, 0x0

    goto :goto_41

    .line 239
    :cond_36
    iget-object v5, v5, Lb5/R1;->d:Ljava/util/BitSet;

    invoke-virtual {v5, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    move/from16 v32, v5

    .line 240
    :goto_41
    iget-wide v4, v7, Lb5/r;->c:J

    move-object/from16 v26, v0

    move-object/from16 v27, v2

    move-wide/from16 v29, v4

    move-object/from16 v31, v7

    invoke-virtual/range {v25 .. v32}, Lb5/b;->a(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/V0;JLb5/r;Z)Z

    move-result v5

    move-object/from16 v0, v25

    if-eqz v5, :cond_37

    .line 241
    invoke-virtual {v1, v12}, Lb5/c;->q0(Ljava/lang/Integer;)Lb5/R1;

    move-result-object v2

    .line 242
    invoke-virtual {v2, v0}, Lb5/R1;->b(Lb5/b;)V

    move-object/from16 v7, p1

    move-object v2, v12

    move-object/from16 v0, v21

    move-object/from16 v12, v22

    goto :goto_40

    :cond_37
    iget-object v0, v1, Lb5/c;->e:Ljava/util/HashSet;

    .line 243
    invoke-virtual {v0, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_42

    :cond_38
    move-object/from16 v21, v0

    move-object/from16 p1, v7

    move-object/from16 v22, v12

    move-object v12, v2

    :goto_42
    if-nez v5, :cond_39

    iget-object v0, v1, Lb5/c;->e:Ljava/util/HashSet;

    .line 244
    invoke-virtual {v0, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_39
    move-object/from16 v7, p1

    move-object/from16 v0, v21

    move-object/from16 v12, v22

    goto/16 :goto_3f

    :cond_3a
    :goto_43
    if-nez p6, :cond_50

    .line 245
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3b

    goto/16 :goto_5d

    .line 246
    :cond_3b
    new-instance v2, Ls/e;

    .line 247
    invoke-direct {v2}, Ls/e;-><init>()V

    .line 248
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_44
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/measurement/n1;

    .line 249
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n1;->s()Ljava/lang/String;

    move-result-object v5

    .line 250
    invoke-virtual {v2, v5}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_41

    .line 251
    invoke-virtual {v15}, Lb5/J1;->i0()Lb5/n;

    move-result-object v0

    iget-object v7, v0, LD/n;->a:Ljava/lang/Object;

    check-cast v7, Lb5/n0;

    iget-object v12, v1, Lb5/c;->d:Ljava/lang/String;

    .line 252
    invoke-virtual {v0}, Lb5/D1;->m0()V

    .line 253
    invoke-virtual {v0}, LD/n;->l0()V

    .line 254
    invoke-static {v12}, LF4/y;->e(Ljava/lang/String;)V

    .line 255
    invoke-static {v5}, LF4/y;->e(Ljava/lang/String;)V

    new-instance v13, Ls/e;

    .line 256
    invoke-direct {v13}, Ls/e;-><init>()V

    .line 257
    invoke-virtual {v0}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v25

    :try_start_20
    const-string v26, "property_filters"

    filled-new-array {v10, v9}, [Ljava/lang/String;

    move-result-object v27

    const-string v28, "app_id=? AND property_name=?"

    filled-new-array {v12, v5}, [Ljava/lang/String;

    move-result-object v29

    const/16 v32, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    .line 258
    invoke-virtual/range {v25 .. v32}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v14
    :try_end_20
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_20 .. :try_end_20} :catch_1c
    .catchall {:try_start_20 .. :try_end_20} :catchall_d

    .line 259
    :try_start_21
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0
    :try_end_21
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_21 .. :try_end_21} :catch_1b
    .catchall {:try_start_21 .. :try_end_21} :catchall_c

    if-eqz v0, :cond_3e

    move-object/from16 v17, v3

    :goto_45
    const/4 v3, 0x1

    .line 260
    :try_start_22
    invoke-interface {v14, v3}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0
    :try_end_22
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_22 .. :try_end_22} :catch_17
    .catchall {:try_start_22 .. :try_end_22} :catchall_c

    .line 261
    :try_start_23
    invoke-static {}, Lcom/google/android/gms/internal/measurement/v0;->p()Lcom/google/android/gms/internal/measurement/u0;

    move-result-object v3
    :try_end_23
    .catch Ljava/io/IOException; {:try_start_23 .. :try_end_23} :catch_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_23 .. :try_end_23} :catch_17
    .catchall {:try_start_23 .. :try_end_23} :catchall_c

    :try_start_24
    invoke-static {v3, v0}, Lb5/Z;->R0(Lcom/google/android/gms/internal/measurement/a2;[B)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v0
    :try_end_24
    .catch Ljava/io/IOException; {:try_start_24 .. :try_end_24} :catch_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_24 .. :try_end_24} :catch_19
    .catchall {:try_start_24 .. :try_end_24} :catchall_c

    :try_start_25
    check-cast v0, Lcom/google/android/gms/internal/measurement/u0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->h()Lcom/google/android/gms/internal/measurement/b2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/v0;
    :try_end_25
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_25} :catch_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_25 .. :try_end_25} :catch_17
    .catchall {:try_start_25 .. :try_end_25} :catchall_c

    const/4 v3, 0x0

    .line 262
    :try_start_26
    invoke-interface {v14, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    .line 263
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v13, v3}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/List;
    :try_end_26
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_26 .. :try_end_26} :catch_17
    .catchall {:try_start_26 .. :try_end_26} :catchall_c

    if-nez v16, :cond_3c

    move-object/from16 p1, v7

    :try_start_27
    new-instance v7, Ljava/util/ArrayList;

    .line 264
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 265
    invoke-virtual {v13, v3, v7}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_47

    :catchall_c
    move-exception v0

    goto :goto_4b

    :catch_16
    move-exception v0

    :goto_46
    move-object/from16 v16, v9

    goto :goto_4c

    :cond_3c
    move-object/from16 p1, v7

    move-object/from16 v7, v16

    .line 266
    :goto_47
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v16, v9

    goto :goto_4a

    :catch_17
    move-exception v0

    :goto_48
    move-object/from16 p1, v7

    goto :goto_46

    :catch_18
    move-exception v0

    move-object/from16 p1, v7

    goto :goto_49

    :catch_19
    move-exception v0

    goto :goto_48

    .line 267
    :goto_49
    invoke-virtual/range {p1 .. p1}, Lb5/n0;->A()Lb5/V;

    move-result-object v3

    .line 268
    invoke-virtual {v3}, Lb5/V;->q0()Lb5/T;

    move-result-object v3

    const-string v7, "Failed to merge filter"
    :try_end_27
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_27 .. :try_end_27} :catch_16
    .catchall {:try_start_27 .. :try_end_27} :catchall_c

    move-object/from16 v16, v9

    :try_start_28
    invoke-static {v12}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v9

    invoke-virtual {v3, v9, v0, v7}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    :goto_4a
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_28
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_28 .. :try_end_28} :catch_1a
    .catchall {:try_start_28 .. :try_end_28} :catchall_c

    if-nez v0, :cond_3d

    .line 270
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    move-object v0, v13

    goto :goto_50

    :cond_3d
    move-object/from16 v7, p1

    move-object/from16 v9, v16

    goto :goto_45

    :catch_1a
    move-exception v0

    goto :goto_4c

    :cond_3e
    move-object/from16 v17, v3

    move-object/from16 p1, v7

    move-object/from16 v16, v9

    .line 271
    :try_start_29
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_29
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_29 .. :try_end_29} :catch_1a
    .catchall {:try_start_29 .. :try_end_29} :catchall_c

    .line 272
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    goto :goto_50

    :goto_4b
    move-object v7, v14

    goto :goto_51

    :catch_1b
    move-exception v0

    move-object/from16 v17, v3

    goto :goto_48

    :goto_4c
    move-object v7, v14

    goto :goto_4f

    :catchall_d
    move-exception v0

    goto :goto_4d

    :catch_1c
    move-exception v0

    move-object/from16 v17, v3

    move-object/from16 p1, v7

    move-object/from16 v16, v9

    goto :goto_4e

    :goto_4d
    const/4 v7, 0x0

    goto :goto_51

    :goto_4e
    const/4 v7, 0x0

    .line 273
    :goto_4f
    :try_start_2a
    invoke-virtual/range {p1 .. p1}, Lb5/n0;->A()Lb5/V;

    move-result-object v3

    .line 274
    invoke-virtual {v3}, Lb5/V;->q0()Lb5/T;

    move-result-object v3

    invoke-static {v12}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v9

    .line 275
    invoke-virtual {v3, v9, v0, v11}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_e

    if-eqz v7, :cond_3f

    .line 277
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 278
    :cond_3f
    :goto_50
    invoke-virtual {v2, v5, v0}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_52

    :catchall_e
    move-exception v0

    :goto_51
    if-eqz v7, :cond_40

    .line 279
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 280
    :cond_40
    throw v0

    :cond_41
    move-object/from16 v17, v3

    move-object/from16 v16, v9

    .line 281
    :goto_52
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_53
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_42

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v9, v1, Lb5/c;->e:Ljava/util/HashSet;

    .line 282
    invoke-virtual {v9, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_43

    .line 283
    invoke-virtual/range {v24 .. v24}, Lb5/n0;->A()Lb5/V;

    move-result-object v0

    .line 284
    invoke-virtual {v0}, Lb5/V;->r0()Lb5/T;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_42
    move-object/from16 v9, v16

    move-object/from16 v3, v17

    goto/16 :goto_44

    .line 285
    :cond_43
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    .line 286
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v12, 0x1

    :goto_54
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/v0;

    .line 287
    invoke-virtual/range {v24 .. v24}, Lb5/n0;->A()Lb5/V;

    move-result-object v13

    .line 288
    invoke-virtual {v13}, Lb5/V;->w0()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x2

    invoke-static {v13, v14}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v13

    if-eqz v13, :cond_45

    .line 289
    invoke-virtual/range {v24 .. v24}, Lb5/n0;->A()Lb5/V;

    move-result-object v13

    .line 290
    invoke-virtual {v13}, Lb5/V;->r0()Lb5/T;

    move-result-object v13

    .line 291
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/v0;->v()Z

    move-result v14

    if-eqz v14, :cond_44

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/v0;->n()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    :goto_55
    move-object/from16 v20, v0

    goto :goto_56

    :cond_44
    const/4 v14, 0x0

    goto :goto_55

    .line 292
    :goto_56
    invoke-virtual/range {v24 .. v24}, Lb5/n0;->k()Lb5/O;

    move-result-object v0

    move-object/from16 v21, v2

    .line 293
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/v0;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb5/O;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Evaluating filter. audience, filter, property"

    .line 294
    invoke-virtual {v13, v2, v5, v14, v0}, Lb5/T;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 295
    invoke-virtual/range {v24 .. v24}, Lb5/n0;->A()Lb5/V;

    move-result-object v0

    .line 296
    invoke-virtual {v0}, Lb5/V;->r0()Lb5/T;

    move-result-object v0

    .line 297
    invoke-virtual {v15}, Lb5/J1;->a()Lb5/Z;

    move-result-object v2

    .line 298
    invoke-virtual {v2, v12}, Lb5/Z;->T0(Lcom/google/android/gms/internal/measurement/v0;)Ljava/lang/String;

    move-result-object v2

    const-string v13, "Filter definition"

    invoke-virtual {v0, v2, v13}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_57

    :cond_45
    move-object/from16 v20, v0

    move-object/from16 v21, v2

    .line 299
    :goto_57
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/v0;->v()Z

    move-result v0

    if-eqz v0, :cond_49

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/v0;->n()I

    move-result v0

    const/16 v2, 0x100

    if-le v0, v2, :cond_46

    goto :goto_59

    .line 300
    :cond_46
    new-instance v0, Lb5/b;

    iget-object v2, v1, Lb5/c;->d:Ljava/lang/String;

    const/4 v13, 0x1

    move-object/from16 p1, v0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move/from16 p4, v7

    move-object/from16 p5, v12

    move/from16 p6, v13

    invoke-direct/range {p1 .. p6}, Lb5/b;-><init>(Lb5/c;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/b2;I)V

    move-object/from16 v2, p1

    move/from16 v0, p4

    iget-object v7, v1, Lb5/c;->g:Ljava/lang/Long;

    iget-object v13, v1, Lb5/c;->h:Ljava/lang/Long;

    .line 301
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/v0;->n()I

    move-result v12

    .line 302
    iget-object v14, v1, Lb5/c;->f:Ls/e;

    invoke-virtual {v14, v5}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lb5/R1;

    if-nez v14, :cond_47

    const/4 v12, 0x0

    goto :goto_58

    .line 303
    :cond_47
    iget-object v14, v14, Lb5/R1;->d:Ljava/util/BitSet;

    invoke-virtual {v14, v12}, Ljava/util/BitSet;->get(I)Z

    move-result v12

    .line 304
    :goto_58
    invoke-virtual {v2, v7, v13, v4, v12}, Lb5/b;->b(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/n1;Z)Z

    move-result v12

    if-eqz v12, :cond_48

    .line 305
    invoke-virtual {v1, v5}, Lb5/c;->q0(Ljava/lang/Integer;)Lb5/R1;

    move-result-object v7

    .line 306
    invoke-virtual {v7, v2}, Lb5/R1;->b(Lb5/b;)V

    move v7, v0

    move-object/from16 v0, v20

    move-object/from16 v2, v21

    goto/16 :goto_54

    :cond_48
    iget-object v0, v1, Lb5/c;->e:Ljava/util/HashSet;

    .line 307
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_5b

    .line 308
    :cond_49
    :goto_59
    invoke-virtual/range {v24 .. v24}, Lb5/n0;->A()Lb5/V;

    move-result-object v0

    .line 309
    invoke-virtual {v0}, Lb5/V;->s0()Lb5/T;

    move-result-object v0

    iget-object v2, v1, Lb5/c;->d:Ljava/lang/String;

    invoke-static {v2}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v2

    .line 310
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/v0;->v()Z

    move-result v7

    if-eqz v7, :cond_4a

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/v0;->n()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_5a

    :cond_4a
    const/4 v7, 0x0

    :goto_5a
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "Invalid property filter ID. appId, id"

    .line 311
    invoke-virtual {v0, v2, v7, v9}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5c

    :cond_4b
    move-object/from16 v20, v0

    move-object/from16 v21, v2

    :goto_5b
    if-nez v12, :cond_4c

    :goto_5c
    iget-object v0, v1, Lb5/c;->e:Ljava/util/HashSet;

    .line 312
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_4c
    move-object/from16 v0, v20

    move-object/from16 v2, v21

    goto/16 :goto_53

    .line 313
    :cond_4d
    :goto_5d
    new-instance v2, Ljava/util/ArrayList;

    .line 314
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v1, Lb5/c;->f:Ls/e;

    .line 315
    invoke-virtual {v0}, Ls/e;->keySet()Ljava/util/Set;

    move-result-object v0

    iget-object v3, v1, Lb5/c;->e:Ljava/util/HashSet;

    .line 316
    check-cast v0, Ls/b;

    invoke-virtual {v0, v3}, Ls/b;->removeAll(Ljava/util/Collection;)Z

    .line 317
    invoke-virtual {v0}, Ls/b;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4e
    :goto_5e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, v1, Lb5/c;->f:Ls/e;

    .line 318
    invoke-virtual {v5, v0}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb5/R1;

    .line 319
    invoke-static {v5}, LF4/y;->h(Ljava/lang/Object;)V

    .line 320
    invoke-virtual {v5, v4}, Lb5/R1;->a(I)Lcom/google/android/gms/internal/measurement/R0;

    move-result-object v4

    .line 321
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    invoke-virtual {v15}, Lb5/J1;->i0()Lb5/n;

    move-result-object v5

    iget-object v6, v5, LD/n;->a:Ljava/lang/Object;

    check-cast v6, Lb5/n0;

    iget-object v7, v1, Lb5/c;->d:Ljava/lang/String;

    .line 323
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/R0;->p()Lcom/google/android/gms/internal/measurement/g1;

    move-result-object v4

    .line 324
    invoke-virtual {v5}, Lb5/D1;->m0()V

    .line 325
    invoke-virtual {v5}, LD/n;->l0()V

    .line 326
    invoke-static {v7}, LF4/y;->e(Ljava/lang/String;)V

    .line 327
    invoke-static {v4}, LF4/y;->h(Ljava/lang/Object;)V

    .line 328
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/N1;->c()[B

    move-result-object v4

    new-instance v9, Landroid/content/ContentValues;

    .line 329
    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    const-string v11, "app_id"

    .line 330
    invoke-virtual {v9, v11, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    invoke-virtual {v9, v10, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 332
    invoke-virtual {v9, v8, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 333
    :try_start_2b
    invoke-virtual {v5}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v4, "audience_filter_values"
    :try_end_2b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2b .. :try_end_2b} :catch_1e

    const/4 v5, 0x5

    const/4 v11, 0x0

    .line 334
    :try_start_2c
    invoke-virtual {v0, v4, v11, v9, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v4

    const-wide/16 v12, -0x1

    cmp-long v0, v4, v12

    if-nez v0, :cond_4e

    .line 335
    invoke-virtual {v6}, Lb5/n0;->A()Lb5/V;

    move-result-object v0

    .line 336
    invoke-virtual {v0}, Lb5/V;->q0()Lb5/T;

    move-result-object v0

    const-string v4, "Failed to insert filter results (got -1). appId"

    invoke-static {v7}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v5

    .line 337
    invoke-virtual {v0, v5, v4}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2c .. :try_end_2c} :catch_1d

    goto :goto_5e

    :catch_1d
    move-exception v0

    goto :goto_5f

    :catch_1e
    move-exception v0

    const/4 v11, 0x0

    .line 338
    :goto_5f
    invoke-virtual {v6}, Lb5/n0;->A()Lb5/V;

    move-result-object v4

    .line 339
    invoke-virtual {v4}, Lb5/V;->q0()Lb5/T;

    move-result-object v4

    invoke-static {v7}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object v5

    const-string v6, "Error storing filter results. appId"

    .line 340
    invoke-virtual {v4, v5, v0, v6}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_5e

    :cond_4f
    return-object v2

    .line 341
    :cond_50
    new-instance v0, Ljava/util/ArrayList;

    .line 342
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    :goto_60
    if-eqz v7, :cond_51

    .line 343
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 344
    :cond_51
    throw v0
.end method

.method public final q0(Ljava/lang/Integer;)Lb5/R1;
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/c;->f:Ls/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls/i;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lb5/c;->f:Ls/e;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lb5/R1;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance v0, Lb5/R1;

    .line 19
    .line 20
    iget-object v1, p0, Lb5/c;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Lb5/R1;-><init>(Lb5/c;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lb5/c;->f:Ls/e;

    .line 26
    .line 27
    invoke-virtual {v1, p1, v0}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-object v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
