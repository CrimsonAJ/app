.class public final synthetic Lb5/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb5/m1;Ljava/util/concurrent/atomic/AtomicReference;Lb5/Q1;Lb5/B1;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lb5/q0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/q0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb5/q0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb5/q0;->e:Ljava/lang/Object;

    iput-object p4, p0, Lb5/q0;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lb5/w0;Landroid/os/Bundle;Ljava/lang/String;Lb5/Q1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb5/q0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/q0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb5/q0;->d:Ljava/lang/Object;

    iput-object p3, p0, Lb5/q0;->c:Ljava/lang/Object;

    iput-object p4, p0, Lb5/q0;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb7/c;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lb5/q0;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb5/q0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb5/q0;->b:Ljava/lang/Object;

    iput-object p4, p0, Lb5/q0;->d:Ljava/lang/Object;

    iput-object p1, p0, Lb5/q0;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/L;Lb5/t;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb5/q0;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb5/q0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb5/q0;->d:Ljava/lang/Object;

    iput-object p4, p0, Lb5/q0;->c:Ljava/lang/Object;

    iput-object p1, p0, Lb5/q0;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;LG4/a;Ljava/lang/Object;I)V
    .locals 0

    .line 5
    iput p5, p0, Lb5/q0;->a:I

    iput-object p1, p0, Lb5/q0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb5/q0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb5/q0;->d:Ljava/lang/Object;

    iput-object p4, p0, Lb5/q0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 6
    iput p5, p0, Lb5/q0;->a:I

    iput-object p2, p0, Lb5/q0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb5/q0;->c:Ljava/lang/Object;

    iput-object p4, p0, Lb5/q0;->d:Ljava/lang/Object;

    iput-object p1, p0, Lb5/q0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lb5/q0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb5/m1;

    .line 4
    .line 5
    iget-object v1, p0, Lb5/q0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    .line 9
    iget-object v2, p0, Lb5/q0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lb5/Q1;

    .line 12
    .line 13
    iget-object v3, p0, Lb5/q0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lb5/B1;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    iget-object v4, v0, Lb5/m1;->d:Lb5/G;

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    iget-object v2, v0, LD/n;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lb5/n0;

    .line 25
    .line 26
    iget-object v2, v2, Lb5/n0;->i:Lb5/V;

    .line 27
    .line 28
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, v2, Lb5/V;->f:Lb5/T;

    .line 32
    .line 33
    const-string v3, "[sgtm] Failed to get upload batches; not connected to service"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Lb5/T;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_2

    .line 42
    :catch_0
    move-exception v2

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    :try_start_2
    new-instance v5, Lb5/h1;

    .line 45
    .line 46
    invoke-direct {v5, v0, v1}, Lb5/h1;-><init>(Lb5/m1;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v4, v2, v3, v5}, Lb5/G;->W(Lb5/Q1;Lb5/B1;Lb5/K;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lb5/m1;->B0()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :goto_0
    :try_start_3
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lb5/n0;

    .line 59
    .line 60
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 61
    .line 62
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 66
    .line 67
    const-string v3, "[sgtm] Failed to get upload batches; remote exception"

    .line 68
    .line 69
    invoke-virtual {v0, v2, v3}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 73
    .line 74
    .line 75
    :goto_1
    monitor-exit v1

    .line 76
    return-void

    .line 77
    :goto_2
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 78
    throw v0
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method


# virtual methods
.method public final run()V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    iget v5, v1, Lb5/q0;->a:I

    .line 8
    .line 9
    packed-switch v5, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v5, v1, Lb5/q0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v5, Lp1/j;

    .line 15
    .line 16
    const-string v6, "Ignoring setProgressAsync(...). WorkSpec ("

    .line 17
    .line 18
    iget-object v7, v1, Lb5/q0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v7, Ljava/util/UUID;

    .line 21
    .line 22
    invoke-virtual {v7}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 27
    .line 28
    .line 29
    move-result-object v9

    .line 30
    sget-object v10, Lo1/o;->c:Ljava/lang/String;

    .line 31
    .line 32
    new-instance v11, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v12, "Updating progress for "

    .line 35
    .line 36
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v7, " ("

    .line 43
    .line 44
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v7, v1, Lb5/q0;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v7, Le1/h;

    .line 50
    .line 51
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v12, ")"

    .line 55
    .line 56
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    new-array v12, v4, [Ljava/lang/Throwable;

    .line 64
    .line 65
    invoke-virtual {v9, v10, v11, v12}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    iget-object v9, v1, Lb5/q0;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v9, Lo1/o;

    .line 71
    .line 72
    iget-object v11, v9, Lo1/o;->a:Landroidx/work/impl/WorkDatabase;

    .line 73
    .line 74
    iget-object v9, v9, Lo1/o;->a:Landroidx/work/impl/WorkDatabase;

    .line 75
    .line 76
    invoke-virtual {v11}, LG0/E;->c()V

    .line 77
    .line 78
    .line 79
    :try_start_0
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    invoke-virtual {v11, v8}, LG6/e;->l(Ljava/lang/String;)Ln1/j;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    if-eqz v11, :cond_1

    .line 88
    .line 89
    iget v11, v11, Ln1/j;->b:I

    .line 90
    .line 91
    if-ne v11, v0, :cond_0

    .line 92
    .line 93
    new-instance v0, Ln1/g;

    .line 94
    .line 95
    invoke-direct {v0, v8, v7}, Ln1/g;-><init>(Ljava/lang/String;Le1/h;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->u()Lcom/google/firebase/messaging/s;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    iget-object v7, v6, Lcom/google/firebase/messaging/s;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v7, Landroidx/work/impl/WorkDatabase_Impl;

    .line 105
    .line 106
    invoke-virtual {v7}, LG0/E;->b()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v7}, LG0/E;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 110
    .line 111
    .line 112
    :try_start_1
    iget-object v6, v6, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v6, Ln1/b;

    .line 115
    .line 116
    invoke-virtual {v6, v0}, Ln1/b;->l(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7}, LG0/E;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    .line 121
    .line 122
    :try_start_2
    invoke-virtual {v7}, LG0/E;->m()V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    invoke-virtual {v7}, LG0/E;->m()V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :catchall_1
    move-exception v0

    .line 132
    goto :goto_2

    .line 133
    :cond_0
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    new-instance v7, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v6, ") is not in a RUNNING state."

    .line 146
    .line 147
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    new-array v7, v4, [Ljava/lang/Throwable;

    .line 155
    .line 156
    invoke-virtual {v0, v10, v6, v7}, Le1/q;->k(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    :goto_0
    invoke-virtual {v5, v3}, Lp1/j;->j(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9}, LG0/E;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 163
    .line 164
    .line 165
    :goto_1
    invoke-virtual {v9}, LG0/E;->m()V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_1
    :try_start_3
    const-string v0, "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 170
    .line 171
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 172
    .line 173
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 177
    :goto_2
    :try_start_4
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    sget-object v6, Lo1/o;->c:Ljava/lang/String;

    .line 182
    .line 183
    const-string v7, "Error updating Worker progress"

    .line 184
    .line 185
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 186
    .line 187
    aput-object v0, v2, v4

    .line 188
    .line 189
    invoke-virtual {v3, v6, v7, v2}, Le1/q;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, v0}, Lp1/j;->k(Ljava/lang/Throwable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :goto_3
    return-void

    .line 197
    :catchall_2
    move-exception v0

    .line 198
    invoke-virtual {v9}, LG0/E;->m()V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :pswitch_0
    iget-object v0, v1, Lb5/q0;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, Lo/e;

    .line 205
    .line 206
    if-eqz v0, :cond_2

    .line 207
    .line 208
    iget-object v5, v1, Lb5/q0;->e:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v5, Lf5/o;

    .line 211
    .line 212
    iget-object v6, v5, Lf5/o;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v6, Lo/f;

    .line 215
    .line 216
    iput-boolean v2, v6, Lo/f;->z:Z

    .line 217
    .line 218
    iget-object v0, v0, Lo/e;->b:Lo/l;

    .line 219
    .line 220
    invoke-virtual {v0, v4}, Lo/l;->c(Z)V

    .line 221
    .line 222
    .line 223
    iget-object v0, v5, Lf5/o;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, Lo/f;

    .line 226
    .line 227
    iput-boolean v4, v0, Lo/f;->z:Z

    .line 228
    .line 229
    :cond_2
    iget-object v0, v1, Lb5/q0;->c:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v0, Lo/n;

    .line 232
    .line 233
    invoke-virtual {v0}, Lo/n;->isEnabled()Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-eqz v2, :cond_3

    .line 238
    .line 239
    invoke-virtual {v0}, Lo/n;->hasSubMenu()Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_3

    .line 244
    .line 245
    iget-object v2, v1, Lb5/q0;->d:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v2, Lo/l;

    .line 248
    .line 249
    const/4 v4, 0x4

    .line 250
    invoke-virtual {v2, v0, v3, v4}, Lo/l;->q(Landroid/view/MenuItem;Lo/x;I)Z

    .line 251
    .line 252
    .line 253
    :cond_3
    return-void

    .line 254
    :pswitch_1
    iget-object v0, v1, Lb5/q0;->e:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, Lb7/c;

    .line 257
    .line 258
    iget-object v0, v0, Lb7/c;->b:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, Lb5/J1;

    .line 261
    .line 262
    invoke-virtual {v0}, Lb5/J1;->b()Lb5/P1;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v0}, Lb5/J1;->S()LK4/a;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 274
    .line 275
    .line 276
    move-result-wide v6

    .line 277
    iget-object v3, v1, Lb5/q0;->b:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v3, Ljava/lang/String;

    .line 280
    .line 281
    iget-object v4, v1, Lb5/q0;->d:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v4, Landroid/os/Bundle;

    .line 284
    .line 285
    const-string v5, "auto"

    .line 286
    .line 287
    const/4 v8, 0x0

    .line 288
    invoke-virtual/range {v2 .. v8}, Lb5/P1;->r0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)Lb5/t;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-static {v2}, LF4/y;->h(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    iget-object v3, v1, Lb5/q0;->c:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v3, Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {v0, v2, v3}, Lb5/J1;->m(Lb5/t;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :pswitch_2
    iget-object v0, v1, Lb5/q0;->d:Ljava/lang/Object;

    .line 304
    .line 305
    move-object v2, v0

    .line 306
    check-cast v2, Lcom/google/android/gms/internal/measurement/L;

    .line 307
    .line 308
    iget-object v0, v1, Lb5/q0;->e:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v0, Lb5/m1;

    .line 311
    .line 312
    iget-object v4, v0, LD/n;->a:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v4, Lb5/n0;

    .line 315
    .line 316
    :try_start_5
    iget-object v5, v0, Lb5/m1;->d:Lb5/G;

    .line 317
    .line 318
    if-nez v5, :cond_4

    .line 319
    .line 320
    iget-object v0, v4, Lb5/n0;->i:Lb5/V;

    .line 321
    .line 322
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 323
    .line 324
    .line 325
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 326
    .line 327
    const-string v5, "Discarding data. Failed to send event to service to bundle"

    .line 328
    .line 329
    invoke-virtual {v0, v5}, Lb5/T;->b(Ljava/lang/String;)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 330
    .line 331
    .line 332
    iget-object v0, v4, Lb5/n0;->l:Lb5/P1;

    .line 333
    .line 334
    invoke-static {v0}, Lb5/n0;->d(LD/n;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v2, v3}, Lb5/P1;->K0(Lcom/google/android/gms/internal/measurement/L;[B)V

    .line 338
    .line 339
    .line 340
    goto :goto_6

    .line 341
    :catchall_3
    move-exception v0

    .line 342
    goto :goto_7

    .line 343
    :catch_0
    move-exception v0

    .line 344
    goto :goto_4

    .line 345
    :cond_4
    :try_start_6
    iget-object v6, v1, Lb5/q0;->b:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v6, Lb5/t;

    .line 348
    .line 349
    iget-object v7, v1, Lb5/q0;->c:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v7, Ljava/lang/String;

    .line 352
    .line 353
    invoke-interface {v5, v6, v7}, Lb5/G;->v(Lb5/t;Ljava/lang/String;)[B

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-virtual {v0}, Lb5/m1;->B0()V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 358
    .line 359
    .line 360
    goto :goto_5

    .line 361
    :goto_4
    :try_start_7
    iget-object v5, v4, Lb5/n0;->i:Lb5/V;

    .line 362
    .line 363
    invoke-static {v5}, Lb5/n0;->f(Lb5/x0;)V

    .line 364
    .line 365
    .line 366
    iget-object v5, v5, Lb5/V;->f:Lb5/T;

    .line 367
    .line 368
    const-string v6, "Failed to send event to the service to bundle"

    .line 369
    .line 370
    invoke-virtual {v5, v0, v6}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 371
    .line 372
    .line 373
    :goto_5
    iget-object v0, v4, Lb5/n0;->l:Lb5/P1;

    .line 374
    .line 375
    invoke-static {v0}, Lb5/n0;->d(LD/n;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0, v2, v3}, Lb5/P1;->K0(Lcom/google/android/gms/internal/measurement/L;[B)V

    .line 379
    .line 380
    .line 381
    :goto_6
    return-void

    .line 382
    :goto_7
    iget-object v4, v4, Lb5/n0;->l:Lb5/P1;

    .line 383
    .line 384
    invoke-static {v4}, Lb5/n0;->d(LD/n;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v4, v2, v3}, Lb5/P1;->K0(Lcom/google/android/gms/internal/measurement/L;[B)V

    .line 388
    .line 389
    .line 390
    throw v0

    .line 391
    :pswitch_3
    iget-object v0, v1, Lb5/q0;->e:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 394
    .line 395
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->e:Lb5/n0;

    .line 396
    .line 397
    invoke-virtual {v0}, Lb5/n0;->m()Lb5/m1;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    invoke-virtual {v6}, Lb5/A;->l0()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v6}, Lb5/B;->m0()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v6, v4}, Lb5/m1;->z0(Z)Lb5/Q1;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    new-instance v5, Lb5/o0;

    .line 412
    .line 413
    iget-object v0, v1, Lb5/q0;->d:Ljava/lang/Object;

    .line 414
    .line 415
    move-object v8, v0

    .line 416
    check-cast v8, Ljava/lang/String;

    .line 417
    .line 418
    iget-object v0, v1, Lb5/q0;->b:Ljava/lang/Object;

    .line 419
    .line 420
    move-object v10, v0

    .line 421
    check-cast v10, Lcom/google/android/gms/internal/measurement/L;

    .line 422
    .line 423
    iget-object v0, v1, Lb5/q0;->c:Ljava/lang/Object;

    .line 424
    .line 425
    move-object v7, v0

    .line 426
    check-cast v7, Ljava/lang/String;

    .line 427
    .line 428
    invoke-direct/range {v5 .. v10}, Lb5/o0;-><init>(Lb5/m1;Ljava/lang/String;Ljava/lang/String;Lb5/Q1;Lcom/google/android/gms/internal/measurement/L;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v6, v5}, Lb5/m1;->C0(Ljava/lang/Runnable;)V

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :pswitch_4
    invoke-direct {v1}, Lb5/q0;->a()V

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :pswitch_5
    iget-object v0, v1, Lb5/q0;->b:Ljava/lang/Object;

    .line 440
    .line 441
    move-object v2, v0

    .line 442
    check-cast v2, Lb5/m1;

    .line 443
    .line 444
    iget-object v0, v1, Lb5/q0;->c:Ljava/lang/Object;

    .line 445
    .line 446
    move-object v3, v0

    .line 447
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 448
    .line 449
    iget-object v0, v1, Lb5/q0;->d:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, Lb5/Q1;

    .line 452
    .line 453
    iget-object v4, v1, Lb5/q0;->e:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v4, Landroid/os/Bundle;

    .line 456
    .line 457
    monitor-enter v3

    .line 458
    :try_start_8
    iget-object v5, v2, Lb5/m1;->d:Lb5/G;

    .line 459
    .line 460
    if-nez v5, :cond_5

    .line 461
    .line 462
    iget-object v0, v2, LD/n;->a:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, Lb5/n0;

    .line 465
    .line 466
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 467
    .line 468
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 469
    .line 470
    .line 471
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 472
    .line 473
    const-string v4, "Failed to request trigger URIs; not connected to service"

    .line 474
    .line 475
    invoke-virtual {v0, v4}, Lb5/T;->b(Ljava/lang/String;)V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 476
    .line 477
    .line 478
    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 479
    goto :goto_a

    .line 480
    :catchall_4
    move-exception v0

    .line 481
    goto :goto_b

    .line 482
    :catch_1
    move-exception v0

    .line 483
    goto :goto_8

    .line 484
    :cond_5
    :try_start_a
    new-instance v6, Lb5/g1;

    .line 485
    .line 486
    invoke-direct {v6, v3}, Lb5/g1;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 487
    .line 488
    .line 489
    invoke-interface {v5, v0, v4, v6}, Lb5/G;->m(Lb5/Q1;Landroid/os/Bundle;Lb5/I;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2}, Lb5/m1;->B0()V
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 493
    .line 494
    .line 495
    goto :goto_9

    .line 496
    :goto_8
    :try_start_b
    iget-object v2, v2, LD/n;->a:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast v2, Lb5/n0;

    .line 499
    .line 500
    iget-object v2, v2, Lb5/n0;->i:Lb5/V;

    .line 501
    .line 502
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 503
    .line 504
    .line 505
    iget-object v2, v2, Lb5/V;->f:Lb5/T;

    .line 506
    .line 507
    const-string v4, "Failed to request trigger URIs; remote exception"

    .line 508
    .line 509
    invoke-virtual {v2, v0, v4}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 513
    .line 514
    .line 515
    :goto_9
    monitor-exit v3

    .line 516
    :goto_a
    return-void

    .line 517
    :goto_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 518
    throw v0

    .line 519
    :pswitch_6
    iget-object v0, v1, Lb5/q0;->e:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v0, Lb5/S0;

    .line 522
    .line 523
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v0, Lb5/n0;

    .line 526
    .line 527
    invoke-virtual {v0}, Lb5/n0;->m()Lb5/m1;

    .line 528
    .line 529
    .line 530
    move-result-object v6

    .line 531
    invoke-virtual {v6}, Lb5/A;->l0()V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v6}, Lb5/B;->m0()V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v6, v4}, Lb5/m1;->z0(Z)Lb5/Q1;

    .line 538
    .line 539
    .line 540
    move-result-object v10

    .line 541
    new-instance v5, Lb5/o0;

    .line 542
    .line 543
    iget-object v0, v1, Lb5/q0;->b:Ljava/lang/Object;

    .line 544
    .line 545
    move-object v7, v0

    .line 546
    check-cast v7, Ljava/util/concurrent/atomic/AtomicReference;

    .line 547
    .line 548
    iget-object v0, v1, Lb5/q0;->c:Ljava/lang/Object;

    .line 549
    .line 550
    move-object v8, v0

    .line 551
    check-cast v8, Ljava/lang/String;

    .line 552
    .line 553
    iget-object v0, v1, Lb5/q0;->d:Ljava/lang/Object;

    .line 554
    .line 555
    move-object v9, v0

    .line 556
    check-cast v9, Ljava/lang/String;

    .line 557
    .line 558
    invoke-direct/range {v5 .. v10}, Lb5/o0;-><init>(Lb5/m1;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Lb5/Q1;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v6, v5}, Lb5/m1;->C0(Ljava/lang/Runnable;)V

    .line 562
    .line 563
    .line 564
    return-void

    .line 565
    :pswitch_7
    iget-object v0, v1, Lb5/q0;->e:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 568
    .line 569
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->e:Lb5/n0;

    .line 570
    .line 571
    invoke-virtual {v0}, Lb5/n0;->m()Lb5/m1;

    .line 572
    .line 573
    .line 574
    move-result-object v6

    .line 575
    invoke-virtual {v6}, Lb5/A;->l0()V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v6}, Lb5/B;->m0()V

    .line 579
    .line 580
    .line 581
    iget-object v0, v6, LD/n;->a:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v0, Lb5/n0;

    .line 584
    .line 585
    iget-object v2, v0, Lb5/n0;->l:Lb5/P1;

    .line 586
    .line 587
    invoke-static {v2}, Lb5/n0;->d(LD/n;)V

    .line 588
    .line 589
    .line 590
    sget-object v3, LB4/g;->b:LB4/g;

    .line 591
    .line 592
    iget-object v2, v2, LD/n;->a:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v2, Lb5/n0;

    .line 595
    .line 596
    iget-object v2, v2, Lb5/n0;->a:Landroid/content/Context;

    .line 597
    .line 598
    const v5, 0xbdfcb8

    .line 599
    .line 600
    .line 601
    invoke-virtual {v3, v2, v5}, LB4/g;->b(Landroid/content/Context;I)I

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    iget-object v3, v1, Lb5/q0;->b:Ljava/lang/Object;

    .line 606
    .line 607
    move-object v9, v3

    .line 608
    check-cast v9, Lcom/google/android/gms/internal/measurement/L;

    .line 609
    .line 610
    if-eqz v2, :cond_6

    .line 611
    .line 612
    iget-object v2, v0, Lb5/n0;->i:Lb5/V;

    .line 613
    .line 614
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 615
    .line 616
    .line 617
    const-string v3, "Not bundling data. Service unavailable or out of date"

    .line 618
    .line 619
    iget-object v2, v2, Lb5/V;->i:Lb5/T;

    .line 620
    .line 621
    invoke-virtual {v2, v3}, Lb5/T;->b(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    iget-object v0, v0, Lb5/n0;->l:Lb5/P1;

    .line 625
    .line 626
    invoke-static {v0}, Lb5/n0;->d(LD/n;)V

    .line 627
    .line 628
    .line 629
    new-array v2, v4, [B

    .line 630
    .line 631
    invoke-virtual {v0, v9, v2}, Lb5/P1;->K0(Lcom/google/android/gms/internal/measurement/L;[B)V

    .line 632
    .line 633
    .line 634
    goto :goto_c

    .line 635
    :cond_6
    new-instance v5, Lb5/q0;

    .line 636
    .line 637
    iget-object v0, v1, Lb5/q0;->d:Ljava/lang/Object;

    .line 638
    .line 639
    move-object v7, v0

    .line 640
    check-cast v7, Lb5/t;

    .line 641
    .line 642
    iget-object v0, v1, Lb5/q0;->c:Ljava/lang/Object;

    .line 643
    .line 644
    move-object v8, v0

    .line 645
    check-cast v8, Ljava/lang/String;

    .line 646
    .line 647
    const/4 v10, 0x7

    .line 648
    invoke-direct/range {v5 .. v10}, Lb5/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v6, v5}, Lb5/m1;->C0(Ljava/lang/Runnable;)V

    .line 652
    .line 653
    .line 654
    :goto_c
    return-void

    .line 655
    :pswitch_8
    iget-object v0, v1, Lb5/q0;->b:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v0, Lb5/w0;

    .line 658
    .line 659
    iget-object v2, v0, Lb5/w0;->e:Lb5/J1;

    .line 660
    .line 661
    invoke-virtual {v2}, Lb5/J1;->h0()Lb5/g;

    .line 662
    .line 663
    .line 664
    move-result-object v4

    .line 665
    sget-object v5, Lb5/E;->d1:Lb5/D;

    .line 666
    .line 667
    invoke-virtual {v4, v3, v5}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 668
    .line 669
    .line 670
    move-result v4

    .line 671
    invoke-virtual {v2}, Lb5/J1;->h0()Lb5/g;

    .line 672
    .line 673
    .line 674
    move-result-object v5

    .line 675
    sget-object v6, Lb5/E;->f1:Lb5/D;

    .line 676
    .line 677
    invoke-virtual {v5, v3, v6}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 678
    .line 679
    .line 680
    move-result v5

    .line 681
    iget-object v6, v1, Lb5/q0;->d:Ljava/lang/Object;

    .line 682
    .line 683
    move-object/from16 v16, v6

    .line 684
    .line 685
    check-cast v16, Landroid/os/Bundle;

    .line 686
    .line 687
    invoke-virtual/range {v16 .. v16}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 688
    .line 689
    .line 690
    move-result v6

    .line 691
    iget-object v7, v1, Lb5/q0;->c:Ljava/lang/Object;

    .line 692
    .line 693
    move-object v10, v7

    .line 694
    check-cast v10, Ljava/lang/String;

    .line 695
    .line 696
    iget-object v7, v0, Lb5/w0;->e:Lb5/J1;

    .line 697
    .line 698
    if-eqz v6, :cond_7

    .line 699
    .line 700
    if-eqz v4, :cond_7

    .line 701
    .line 702
    iget-object v2, v7, Lb5/J1;->c:Lb5/n;

    .line 703
    .line 704
    invoke-static {v2}, Lb5/J1;->J(Lb5/D1;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v2}, LD/n;->l0()V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v2}, Lb5/D1;->m0()V

    .line 711
    .line 712
    .line 713
    :try_start_c
    invoke-virtual {v2}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    const-string v3, "delete from default_event_params where app_id=?"

    .line 718
    .line 719
    filled-new-array {v10}, [Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v4

    .line 723
    invoke-virtual {v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_2

    .line 724
    .line 725
    .line 726
    goto/16 :goto_e

    .line 727
    .line 728
    :catch_2
    move-exception v0

    .line 729
    iget-object v2, v2, LD/n;->a:Ljava/lang/Object;

    .line 730
    .line 731
    check-cast v2, Lb5/n0;

    .line 732
    .line 733
    iget-object v2, v2, Lb5/n0;->i:Lb5/V;

    .line 734
    .line 735
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 736
    .line 737
    .line 738
    const-string v3, "Error clearing default event params"

    .line 739
    .line 740
    iget-object v2, v2, Lb5/V;->f:Lb5/T;

    .line 741
    .line 742
    invoke-virtual {v2, v0, v3}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    goto/16 :goto_e

    .line 746
    .line 747
    :cond_7
    iget-object v0, v2, Lb5/J1;->c:Lb5/n;

    .line 748
    .line 749
    invoke-static {v0}, Lb5/J1;->J(Lb5/D1;)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v0}, LD/n;->l0()V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v0}, Lb5/D1;->m0()V

    .line 756
    .line 757
    .line 758
    move-object v2, v7

    .line 759
    new-instance v7, LQ3/j;

    .line 760
    .line 761
    const-wide/16 v12, 0x0

    .line 762
    .line 763
    const-wide/16 v14, 0x0

    .line 764
    .line 765
    iget-object v4, v0, LD/n;->a:Ljava/lang/Object;

    .line 766
    .line 767
    move-object v8, v4

    .line 768
    check-cast v8, Lb5/n0;

    .line 769
    .line 770
    const-string v9, ""

    .line 771
    .line 772
    const-string v11, "dep"

    .line 773
    .line 774
    invoke-direct/range {v7 .. v16}, LQ3/j;-><init>(Lb5/n0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    .line 775
    .line 776
    .line 777
    move-object/from16 v6, v16

    .line 778
    .line 779
    iget-object v4, v0, Lb5/z1;->b:Lb5/J1;

    .line 780
    .line 781
    iget-object v4, v4, Lb5/J1;->g:Lb5/Z;

    .line 782
    .line 783
    invoke-static {v4}, Lb5/J1;->J(Lb5/D1;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v4, v7}, Lb5/Z;->Q0(LQ3/j;)Lcom/google/android/gms/internal/measurement/V0;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/N1;->c()[B

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    iget-object v7, v0, LD/n;->a:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v7, Lb5/n0;

    .line 797
    .line 798
    iget-object v7, v7, Lb5/n0;->i:Lb5/V;

    .line 799
    .line 800
    invoke-static {v7}, Lb5/n0;->f(Lb5/x0;)V

    .line 801
    .line 802
    .line 803
    array-length v8, v4

    .line 804
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 805
    .line 806
    .line 807
    move-result-object v8

    .line 808
    const-string v9, "Saving default event parameters, appId, data size"

    .line 809
    .line 810
    iget-object v11, v7, Lb5/V;->n:Lb5/T;

    .line 811
    .line 812
    invoke-virtual {v11, v10, v8, v9}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    new-instance v8, Landroid/content/ContentValues;

    .line 816
    .line 817
    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 818
    .line 819
    .line 820
    const-string v9, "app_id"

    .line 821
    .line 822
    invoke-virtual {v8, v9, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 823
    .line 824
    .line 825
    const-string v9, "parameters"

    .line 826
    .line 827
    invoke-virtual {v8, v9, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 828
    .line 829
    .line 830
    :try_start_d
    invoke-virtual {v0}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    const-string v4, "default_event_params"

    .line 835
    .line 836
    const/4 v9, 0x5

    .line 837
    invoke-virtual {v0, v4, v3, v8, v9}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 838
    .line 839
    .line 840
    move-result-wide v8

    .line 841
    const-wide/16 v11, -0x1

    .line 842
    .line 843
    cmp-long v0, v8, v11

    .line 844
    .line 845
    if-nez v0, :cond_8

    .line 846
    .line 847
    invoke-static {v7}, Lb5/n0;->f(Lb5/x0;)V

    .line 848
    .line 849
    .line 850
    iget-object v0, v7, Lb5/V;->f:Lb5/T;

    .line 851
    .line 852
    const-string v4, "Failed to insert default event parameters (got -1). appId"

    .line 853
    .line 854
    invoke-static {v10}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    .line 855
    .line 856
    .line 857
    move-result-object v8

    .line 858
    invoke-virtual {v0, v8, v4}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_3

    .line 859
    .line 860
    .line 861
    goto :goto_d

    .line 862
    :catch_3
    move-exception v0

    .line 863
    invoke-static {v7}, Lb5/n0;->f(Lb5/x0;)V

    .line 864
    .line 865
    .line 866
    invoke-static {v10}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    const-string v8, "Error storing default event parameters. appId"

    .line 871
    .line 872
    iget-object v7, v7, Lb5/V;->f:Lb5/T;

    .line 873
    .line 874
    invoke-virtual {v7, v4, v0, v8}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 875
    .line 876
    .line 877
    :cond_8
    :goto_d
    iget-object v0, v2, Lb5/J1;->c:Lb5/n;

    .line 878
    .line 879
    invoke-static {v0}, Lb5/J1;->J(Lb5/D1;)V

    .line 880
    .line 881
    .line 882
    iget-object v4, v1, Lb5/q0;->e:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v4, Lb5/Q1;

    .line 885
    .line 886
    iget-wide v7, v4, Lb5/Q1;->Y:J

    .line 887
    .line 888
    iget-object v4, v0, LD/n;->a:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v4, Lb5/n0;

    .line 891
    .line 892
    iget-object v9, v4, Lb5/n0;->g:Lb5/g;

    .line 893
    .line 894
    sget-object v11, Lb5/E;->f1:Lb5/D;

    .line 895
    .line 896
    invoke-virtual {v9, v3, v11}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 897
    .line 898
    .line 899
    move-result v9

    .line 900
    if-nez v9, :cond_9

    .line 901
    .line 902
    iget-object v9, v4, Lb5/n0;->n:LK4/a;

    .line 903
    .line 904
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 905
    .line 906
    .line 907
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 908
    .line 909
    .line 910
    move-result-wide v11

    .line 911
    const-wide/16 v13, 0x3a98

    .line 912
    .line 913
    add-long/2addr v13, v7

    .line 914
    cmp-long v9, v11, v13

    .line 915
    .line 916
    if-gtz v9, :cond_c

    .line 917
    .line 918
    :cond_9
    :try_start_e
    const-string v9, "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like \'!_%\' escape \'!\' limit 1;"

    .line 919
    .line 920
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v11

    .line 924
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 925
    .line 926
    .line 927
    move-result-object v11

    .line 928
    const-wide/16 v12, 0x0

    .line 929
    .line 930
    invoke-virtual {v0, v12, v13, v9, v11}, Lb5/n;->d1(JLjava/lang/String;[Ljava/lang/String;)J

    .line 931
    .line 932
    .line 933
    move-result-wide v14

    .line 934
    cmp-long v9, v14, v12

    .line 935
    .line 936
    if-lez v9, :cond_a

    .line 937
    .line 938
    goto :goto_e

    .line 939
    :cond_a
    const-string v9, "select count(*) from raw_events where app_id=? and timestamp >= ? and name like \'!_%\' escape \'!\' limit 1;"

    .line 940
    .line 941
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v11

    .line 945
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v11

    .line 949
    invoke-virtual {v0, v12, v13, v9, v11}, Lb5/n;->d1(JLjava/lang/String;[Ljava/lang/String;)J

    .line 950
    .line 951
    .line 952
    move-result-wide v14
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_4

    .line 953
    cmp-long v0, v14, v12

    .line 954
    .line 955
    if-lez v0, :cond_c

    .line 956
    .line 957
    if-eqz v5, :cond_b

    .line 958
    .line 959
    iget-object v0, v2, Lb5/J1;->c:Lb5/n;

    .line 960
    .line 961
    invoke-static {v0}, Lb5/J1;->J(Lb5/D1;)V

    .line 962
    .line 963
    .line 964
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 965
    .line 966
    .line 967
    move-result-object v2

    .line 968
    invoke-virtual {v0, v10, v2, v3, v6}, Lb5/n;->v0(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 969
    .line 970
    .line 971
    goto :goto_e

    .line 972
    :cond_b
    iget-object v0, v2, Lb5/J1;->c:Lb5/n;

    .line 973
    .line 974
    invoke-static {v0}, Lb5/J1;->J(Lb5/D1;)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v0, v10, v3, v3, v6}, Lb5/n;->v0(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 978
    .line 979
    .line 980
    goto :goto_e

    .line 981
    :catch_4
    move-exception v0

    .line 982
    iget-object v2, v4, Lb5/n0;->i:Lb5/V;

    .line 983
    .line 984
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 985
    .line 986
    .line 987
    const-string v3, "Error checking backfill conditions"

    .line 988
    .line 989
    iget-object v2, v2, Lb5/V;->f:Lb5/T;

    .line 990
    .line 991
    invoke-virtual {v2, v0, v3}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 992
    .line 993
    .line 994
    :cond_c
    :goto_e
    return-void

    .line 995
    :pswitch_9
    iget-object v5, v1, Lb5/q0;->e:Ljava/lang/Object;

    .line 996
    .line 997
    check-cast v5, Lb5/K;

    .line 998
    .line 999
    iget-object v6, v1, Lb5/q0;->b:Ljava/lang/Object;

    .line 1000
    .line 1001
    check-cast v6, Lb5/w0;

    .line 1002
    .line 1003
    iget-object v6, v6, Lb5/w0;->e:Lb5/J1;

    .line 1004
    .line 1005
    invoke-virtual {v6}, Lb5/J1;->e()V

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v6}, Lb5/J1;->h0()Lb5/g;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v7

    .line 1012
    sget-object v8, Lb5/E;->Q0:Lb5/D;

    .line 1013
    .line 1014
    invoke-virtual {v7, v3, v8}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v7

    .line 1018
    iget-object v8, v1, Lb5/q0;->c:Ljava/lang/Object;

    .line 1019
    .line 1020
    check-cast v8, Ljava/lang/String;

    .line 1021
    .line 1022
    if-nez v7, :cond_d

    .line 1023
    .line 1024
    new-instance v0, Lb5/C1;

    .line 1025
    .line 1026
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1027
    .line 1028
    invoke-direct {v0, v2}, Lb5/C1;-><init>(Ljava/util/List;)V

    .line 1029
    .line 1030
    .line 1031
    move-object v15, v5

    .line 1032
    goto/16 :goto_16

    .line 1033
    .line 1034
    :cond_d
    invoke-static {v6}, LA0/a;->v(Lb5/J1;)V

    .line 1035
    .line 1036
    .line 1037
    iget-object v7, v6, Lb5/J1;->c:Lb5/n;

    .line 1038
    .line 1039
    invoke-static {v7}, Lb5/J1;->J(Lb5/D1;)V

    .line 1040
    .line 1041
    .line 1042
    sget-object v9, Lb5/E;->B:Lb5/D;

    .line 1043
    .line 1044
    invoke-virtual {v9, v3}, Lb5/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v9

    .line 1048
    check-cast v9, Ljava/lang/Integer;

    .line 1049
    .line 1050
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1051
    .line 1052
    .line 1053
    move-result v9

    .line 1054
    iget-object v10, v1, Lb5/q0;->d:Ljava/lang/Object;

    .line 1055
    .line 1056
    check-cast v10, Lb5/B1;

    .line 1057
    .line 1058
    invoke-virtual {v7, v8, v10, v9}, Lb5/n;->s0(Ljava/lang/String;Lb5/B1;I)Ljava/util/List;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v7

    .line 1062
    new-instance v9, Ljava/util/ArrayList;

    .line 1063
    .line 1064
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1065
    .line 1066
    .line 1067
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v7

    .line 1071
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1072
    .line 1073
    .line 1074
    move-result v10

    .line 1075
    if-eqz v10, :cond_15

    .line 1076
    .line 1077
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v10

    .line 1081
    check-cast v10, Lb5/K1;

    .line 1082
    .line 1083
    iget-object v11, v10, Lb5/K1;->c:Ljava/lang/String;

    .line 1084
    .line 1085
    invoke-virtual {v6, v8, v11}, Lb5/J1;->c0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v11

    .line 1089
    iget-wide v12, v10, Lb5/K1;->a:J

    .line 1090
    .line 1091
    if-nez v11, :cond_e

    .line 1092
    .line 1093
    invoke-virtual {v6}, Lb5/J1;->A()Lb5/V;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v11

    .line 1097
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v12

    .line 1101
    iget-object v10, v10, Lb5/K1;->c:Ljava/lang/String;

    .line 1102
    .line 1103
    const-string v13, "[sgtm] batch skipped due to destination in backoff. appId, rowId, url"

    .line 1104
    .line 1105
    iget-object v11, v11, Lb5/V;->n:Lb5/T;

    .line 1106
    .line 1107
    invoke-virtual {v11, v13, v8, v12, v10}, Lb5/T;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1108
    .line 1109
    .line 1110
    goto :goto_f

    .line 1111
    :cond_e
    iget v11, v10, Lb5/K1;->h:I

    .line 1112
    .line 1113
    if-gtz v11, :cond_f

    .line 1114
    .line 1115
    move/from16 v17, v2

    .line 1116
    .line 1117
    move-object v15, v5

    .line 1118
    goto :goto_10

    .line 1119
    :cond_f
    sget-object v14, Lb5/E;->z:Lb5/D;

    .line 1120
    .line 1121
    invoke-virtual {v14, v3}, Lb5/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v14

    .line 1125
    check-cast v14, Ljava/lang/Integer;

    .line 1126
    .line 1127
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 1128
    .line 1129
    .line 1130
    move-result v14

    .line 1131
    move-object v15, v5

    .line 1132
    iget-wide v4, v10, Lb5/K1;->g:J

    .line 1133
    .line 1134
    if-le v11, v14, :cond_10

    .line 1135
    .line 1136
    move v11, v0

    .line 1137
    move/from16 v17, v2

    .line 1138
    .line 1139
    goto/16 :goto_15

    .line 1140
    .line 1141
    :cond_10
    sget-object v14, Lb5/E;->x:Lb5/D;

    .line 1142
    .line 1143
    invoke-virtual {v14, v3}, Lb5/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v14

    .line 1147
    check-cast v14, Ljava/lang/Long;

    .line 1148
    .line 1149
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 1150
    .line 1151
    .line 1152
    move-result-wide v17

    .line 1153
    add-int/lit8 v11, v11, -0x1

    .line 1154
    .line 1155
    const-wide/16 v19, 0x1

    .line 1156
    .line 1157
    shl-long v19, v19, v11

    .line 1158
    .line 1159
    mul-long v0, v17, v19

    .line 1160
    .line 1161
    sget-object v14, Lb5/E;->y:Lb5/D;

    .line 1162
    .line 1163
    invoke-virtual {v14, v3}, Lb5/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v14

    .line 1167
    check-cast v14, Ljava/lang/Long;

    .line 1168
    .line 1169
    move/from16 v17, v2

    .line 1170
    .line 1171
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 1172
    .line 1173
    .line 1174
    move-result-wide v2

    .line 1175
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 1176
    .line 1177
    .line 1178
    move-result-wide v0

    .line 1179
    invoke-virtual {v6}, Lb5/J1;->S()LK4/a;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v2

    .line 1183
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1184
    .line 1185
    .line 1186
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1187
    .line 1188
    .line 1189
    move-result-wide v2

    .line 1190
    add-long/2addr v0, v4

    .line 1191
    cmp-long v0, v2, v0

    .line 1192
    .line 1193
    if-ltz v0, :cond_14

    .line 1194
    .line 1195
    :goto_10
    new-instance v0, Landroid/os/Bundle;

    .line 1196
    .line 1197
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1198
    .line 1199
    .line 1200
    iget-object v1, v10, Lb5/K1;->d:Ljava/util/HashMap;

    .line 1201
    .line 1202
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v1

    .line 1206
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v1

    .line 1210
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1211
    .line 1212
    .line 1213
    move-result v2

    .line 1214
    if-eqz v2, :cond_11

    .line 1215
    .line 1216
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v2

    .line 1220
    check-cast v2, Ljava/util/Map$Entry;

    .line 1221
    .line 1222
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v3

    .line 1226
    check-cast v3, Ljava/lang/String;

    .line 1227
    .line 1228
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v2

    .line 1232
    check-cast v2, Ljava/lang/String;

    .line 1233
    .line 1234
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1235
    .line 1236
    .line 1237
    goto :goto_11

    .line 1238
    :cond_11
    new-instance v19, Lb5/A1;

    .line 1239
    .line 1240
    iget-object v1, v10, Lb5/K1;->b:Lcom/google/android/gms/internal/measurement/b1;

    .line 1241
    .line 1242
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/N1;->c()[B

    .line 1243
    .line 1244
    .line 1245
    move-result-object v22

    .line 1246
    iget-object v1, v10, Lb5/K1;->e:Lb5/Z0;

    .line 1247
    .line 1248
    iget-object v2, v10, Lb5/K1;->c:Ljava/lang/String;

    .line 1249
    .line 1250
    iget-wide v3, v10, Lb5/K1;->f:J

    .line 1251
    .line 1252
    iget-wide v12, v10, Lb5/K1;->a:J

    .line 1253
    .line 1254
    iget v1, v1, Lb5/Z0;->a:I

    .line 1255
    .line 1256
    const-string v28, ""

    .line 1257
    .line 1258
    move-object/from16 v24, v0

    .line 1259
    .line 1260
    move/from16 v25, v1

    .line 1261
    .line 1262
    move-object/from16 v23, v2

    .line 1263
    .line 1264
    move-wide/from16 v26, v3

    .line 1265
    .line 1266
    move-wide/from16 v20, v12

    .line 1267
    .line 1268
    invoke-direct/range {v19 .. v28}, Lb5/A1;-><init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V

    .line 1269
    .line 1270
    .line 1271
    move-object/from16 v0, v19

    .line 1272
    .line 1273
    :try_start_f
    invoke-static {}, Lcom/google/android/gms/internal/measurement/b1;->o()Lcom/google/android/gms/internal/measurement/a1;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v1

    .line 1277
    iget-object v2, v0, Lb5/A1;->b:[B

    .line 1278
    .line 1279
    invoke-static {v1, v2}, Lb5/Z;->R0(Lcom/google/android/gms/internal/measurement/a2;[B)Lcom/google/android/gms/internal/measurement/a2;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v1

    .line 1283
    check-cast v1, Lcom/google/android/gms/internal/measurement/a1;

    .line 1284
    .line 1285
    const/4 v2, 0x0

    .line 1286
    :goto_12
    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 1287
    .line 1288
    check-cast v3, Lcom/google/android/gms/internal/measurement/b1;

    .line 1289
    .line 1290
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/b1;->n()I

    .line 1291
    .line 1292
    .line 1293
    move-result v3

    .line 1294
    if-ge v2, v3, :cond_12

    .line 1295
    .line 1296
    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 1297
    .line 1298
    check-cast v3, Lcom/google/android/gms/internal/measurement/b1;

    .line 1299
    .line 1300
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/b1;->q(I)Lcom/google/android/gms/internal/measurement/d1;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v3

    .line 1304
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/b2;->f()Lcom/google/android/gms/internal/measurement/a2;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v3

    .line 1308
    check-cast v3, Lcom/google/android/gms/internal/measurement/c1;

    .line 1309
    .line 1310
    invoke-virtual {v6}, Lb5/J1;->S()LK4/a;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v4

    .line 1314
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1318
    .line 1319
    .line 1320
    move-result-wide v4

    .line 1321
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->j()V

    .line 1322
    .line 1323
    .line 1324
    iget-object v10, v3, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 1325
    .line 1326
    check-cast v10, Lcom/google/android/gms/internal/measurement/d1;

    .line 1327
    .line 1328
    invoke-static {v10, v4, v5}, Lcom/google/android/gms/internal/measurement/d1;->B1(Lcom/google/android/gms/internal/measurement/d1;J)V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/a2;->j()V

    .line 1332
    .line 1333
    .line 1334
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 1335
    .line 1336
    check-cast v4, Lcom/google/android/gms/internal/measurement/b1;

    .line 1337
    .line 1338
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a2;->h()Lcom/google/android/gms/internal/measurement/b2;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v3

    .line 1342
    check-cast v3, Lcom/google/android/gms/internal/measurement/d1;

    .line 1343
    .line 1344
    invoke-static {v4, v2, v3}, Lcom/google/android/gms/internal/measurement/b1;->x(Lcom/google/android/gms/internal/measurement/b1;ILcom/google/android/gms/internal/measurement/d1;)V

    .line 1345
    .line 1346
    .line 1347
    add-int/lit8 v2, v2, 0x1

    .line 1348
    .line 1349
    goto :goto_12

    .line 1350
    :catch_5
    const/4 v11, 0x2

    .line 1351
    goto :goto_14

    .line 1352
    :cond_12
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/a2;->h()Lcom/google/android/gms/internal/measurement/b2;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v2

    .line 1356
    check-cast v2, Lcom/google/android/gms/internal/measurement/b1;

    .line 1357
    .line 1358
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/N1;->c()[B

    .line 1359
    .line 1360
    .line 1361
    move-result-object v2

    .line 1362
    iput-object v2, v0, Lb5/A1;->b:[B

    .line 1363
    .line 1364
    invoke-virtual {v6}, Lb5/J1;->A()Lb5/V;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v2

    .line 1368
    invoke-virtual {v2}, Lb5/V;->w0()Ljava/lang/String;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v2
    :try_end_f
    .catch Lcom/google/android/gms/internal/measurement/k2; {:try_start_f .. :try_end_f} :catch_5

    .line 1372
    const/4 v11, 0x2

    .line 1373
    :try_start_10
    invoke-static {v2, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1374
    .line 1375
    .line 1376
    move-result v2

    .line 1377
    if-eqz v2, :cond_13

    .line 1378
    .line 1379
    iget-object v2, v6, Lb5/J1;->g:Lb5/Z;

    .line 1380
    .line 1381
    invoke-static {v2}, Lb5/J1;->J(Lb5/D1;)V

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/a2;->h()Lcom/google/android/gms/internal/measurement/b2;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v1

    .line 1388
    check-cast v1, Lcom/google/android/gms/internal/measurement/b1;

    .line 1389
    .line 1390
    invoke-virtual {v2, v1}, Lb5/Z;->S0(Lcom/google/android/gms/internal/measurement/b1;)Ljava/lang/String;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v1

    .line 1394
    iput-object v1, v0, Lb5/A1;->g:Ljava/lang/String;
    :try_end_10
    .catch Lcom/google/android/gms/internal/measurement/k2; {:try_start_10 .. :try_end_10} :catch_6

    .line 1395
    .line 1396
    :cond_13
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1397
    .line 1398
    .line 1399
    :goto_13
    move-object/from16 v1, p0

    .line 1400
    .line 1401
    move v0, v11

    .line 1402
    move-object v5, v15

    .line 1403
    move/from16 v2, v17

    .line 1404
    .line 1405
    const/4 v3, 0x0

    .line 1406
    const/4 v4, 0x0

    .line 1407
    goto/16 :goto_f

    .line 1408
    .line 1409
    :catch_6
    :goto_14
    invoke-virtual {v6}, Lb5/J1;->A()Lb5/V;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0

    .line 1413
    const-string v1, "Failed to parse queued batch. appId"

    .line 1414
    .line 1415
    iget-object v0, v0, Lb5/V;->i:Lb5/T;

    .line 1416
    .line 1417
    invoke-virtual {v0, v8, v1}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1418
    .line 1419
    .line 1420
    goto :goto_13

    .line 1421
    :cond_14
    const/4 v11, 0x2

    .line 1422
    :goto_15
    invoke-virtual {v6}, Lb5/J1;->A()Lb5/V;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v0

    .line 1426
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v1

    .line 1430
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v2

    .line 1434
    const-string v3, "[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis"

    .line 1435
    .line 1436
    iget-object v0, v0, Lb5/V;->n:Lb5/T;

    .line 1437
    .line 1438
    invoke-virtual {v0, v3, v8, v1, v2}, Lb5/T;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1439
    .line 1440
    .line 1441
    goto :goto_13

    .line 1442
    :cond_15
    move-object v15, v5

    .line 1443
    new-instance v0, Lb5/C1;

    .line 1444
    .line 1445
    invoke-direct {v0, v9}, Lb5/C1;-><init>(Ljava/util/List;)V

    .line 1446
    .line 1447
    .line 1448
    :goto_16
    :try_start_11
    invoke-interface {v15, v0}, Lb5/K;->a1(Lb5/C1;)V

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v6}, Lb5/J1;->A()Lb5/V;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v1

    .line 1455
    iget-object v1, v1, Lb5/V;->n:Lb5/T;

    .line 1456
    .line 1457
    const-string v2, "[sgtm] Sending queued upload batches to client. appId, count"

    .line 1458
    .line 1459
    iget-object v0, v0, Lb5/C1;->a:Ljava/util/List;

    .line 1460
    .line 1461
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1462
    .line 1463
    .line 1464
    move-result v0

    .line 1465
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v0

    .line 1469
    invoke-virtual {v1, v8, v0, v2}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_11
    .catch Landroid/os/RemoteException; {:try_start_11 .. :try_end_11} :catch_7

    .line 1470
    .line 1471
    .line 1472
    goto :goto_17

    .line 1473
    :catch_7
    move-exception v0

    .line 1474
    invoke-virtual {v6}, Lb5/J1;->A()Lb5/V;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v1

    .line 1478
    const-string v2, "[sgtm] Failed to return upload batches for app"

    .line 1479
    .line 1480
    iget-object v1, v1, Lb5/V;->f:Lb5/T;

    .line 1481
    .line 1482
    invoke-virtual {v1, v8, v0, v2}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1483
    .line 1484
    .line 1485
    :goto_17
    return-void

    .line 1486
    nop

    .line 1487
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
.end method
