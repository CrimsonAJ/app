.class public final Lb5/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;
.implements LF4/b;
.implements LF4/c;


# instance fields
.field public volatile a:Z

.field public volatile b:Lb5/P;

.field public final synthetic c:Lb5/m1;


# direct methods
.method public constructor <init>(Lb5/m1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb5/l1;->c:Lb5/m1;

    .line 5
    .line 6
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    iget-object v0, p0, Lb5/l1;->c:Lb5/m1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb5/n0;

    .line 9
    .line 10
    iget-object v2, v0, Lb5/n0;->a:Landroid/content/Context;

    .line 11
    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    iget-boolean v0, p0, Lb5/l1;->a:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lb5/l1;->c:Lb5/m1;

    .line 18
    .line 19
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lb5/n0;

    .line 22
    .line 23
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 24
    .line 25
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Lb5/V;->n:Lb5/T;

    .line 29
    .line 30
    const-string v1, "Connection attempt already in progress"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    move-object v7, p0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, p0, Lb5/l1;->b:Lb5/P;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lb5/l1;->b:Lb5/P;

    .line 45
    .line 46
    invoke-virtual {v0}, LF4/e;->g()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    iget-object v0, p0, Lb5/l1;->b:Lb5/P;

    .line 53
    .line 54
    invoke-virtual {v0}, LF4/e;->a()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    :cond_1
    iget-object v0, p0, Lb5/l1;->c:Lb5/m1;

    .line 61
    .line 62
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lb5/n0;

    .line 65
    .line 66
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 67
    .line 68
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, Lb5/V;->n:Lb5/T;

    .line 72
    .line 73
    const-string v1, "Already awaiting connection attempt"

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    monitor-exit p0

    .line 79
    return-void

    .line 80
    :cond_2
    new-instance v1, Lb5/P;

    .line 81
    .line 82
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-static {v2}, LF4/J;->a(Landroid/content/Context;)LF4/J;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    sget-object v5, LB4/g;->b:LB4/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    const/16 v6, 0x5d

    .line 93
    .line 94
    const/4 v9, 0x0

    .line 95
    move-object v8, p0

    .line 96
    move-object v7, p0

    .line 97
    :try_start_1
    invoke-direct/range {v1 .. v9}, LF4/e;-><init>(Landroid/content/Context;Landroid/os/Looper;LF4/J;LB4/g;ILF4/b;LF4/c;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iput-object v1, v7, Lb5/l1;->b:Lb5/P;

    .line 101
    .line 102
    iget-object v0, v7, Lb5/l1;->c:Lb5/m1;

    .line 103
    .line 104
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lb5/n0;

    .line 107
    .line 108
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 109
    .line 110
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, Lb5/V;->n:Lb5/T;

    .line 114
    .line 115
    const-string v1, "Connecting to remote service"

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/4 v0, 0x1

    .line 121
    iput-boolean v0, v7, Lb5/l1;->a:Z

    .line 122
    .line 123
    iget-object v0, v7, Lb5/l1;->b:Lb5/P;

    .line 124
    .line 125
    invoke-static {v0}, LF4/y;->h(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, v7, Lb5/l1;->b:Lb5/P;

    .line 129
    .line 130
    invoke-virtual {v0}, LF4/e;->n()V

    .line 131
    .line 132
    .line 133
    monitor-exit p0

    .line 134
    return-void

    .line 135
    :catchall_1
    move-exception v0

    .line 136
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 137
    throw v0
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lb5/l1;->c:Lb5/m1;

    .line 2
    .line 3
    iget-object p1, p1, LD/n;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lb5/n0;

    .line 6
    .line 7
    iget-object p1, p1, Lb5/n0;->j:Lb5/m0;

    .line 8
    .line 9
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lb5/m0;->t0()V

    .line 13
    .line 14
    .line 15
    monitor-enter p0

    .line 16
    :try_start_0
    iget-object p1, p0, Lb5/l1;->b:Lb5/P;

    .line 17
    .line 18
    invoke-static {p1}, LF4/y;->h(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lb5/l1;->b:Lb5/P;

    .line 22
    .line 23
    invoke-virtual {p1}, LF4/e;->u()Landroid/os/IInterface;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lb5/G;

    .line 28
    .line 29
    iget-object v0, p0, Lb5/l1;->c:Lb5/m1;

    .line 30
    .line 31
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lb5/n0;

    .line 34
    .line 35
    iget-object v0, v0, Lb5/n0;->j:Lb5/m0;

    .line 36
    .line 37
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lb5/k1;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {v1, p0, p1, v2}, Lb5/k1;-><init>(Lb5/l1;Lb5/G;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lb5/m0;->v0(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_1

    .line 52
    :catch_0
    const/4 p1, 0x0

    .line 53
    :try_start_1
    iput-object p1, p0, Lb5/l1;->b:Lb5/P;

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    iput-boolean p1, p0, Lb5/l1;->a:Z

    .line 57
    .line 58
    :goto_0
    monitor-exit p0

    .line 59
    return-void

    .line 60
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    throw p1
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
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
.end method

.method public final d(LB4/b;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/l1;->c:Lb5/m1;

    .line 2
    .line 3
    iget-object v1, v0, LD/n;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lb5/n0;

    .line 6
    .line 7
    iget-object v1, v1, Lb5/n0;->j:Lb5/m0;

    .line 8
    .line 9
    invoke-static {v1}, Lb5/n0;->f(Lb5/x0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lb5/m0;->t0()V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lb5/n0;

    .line 18
    .line 19
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-boolean v2, v0, Lb5/x0;->b:Z

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v0, v1

    .line 30
    :goto_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, v0, Lb5/V;->i:Lb5/T;

    .line 33
    .line 34
    const-string v2, "Service connection failed"

    .line 35
    .line 36
    invoke-virtual {v0, p1, v2}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    monitor-enter p0

    .line 40
    const/4 v0, 0x0

    .line 41
    :try_start_0
    iput-boolean v0, p0, Lb5/l1;->a:Z

    .line 42
    .line 43
    iput-object v1, p0, Lb5/l1;->b:Lb5/P;

    .line 44
    .line 45
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    iget-object v0, p0, Lb5/l1;->c:Lb5/m1;

    .line 47
    .line 48
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lb5/n0;

    .line 51
    .line 52
    iget-object v0, v0, Lb5/n0;->j:Lb5/m0;

    .line 53
    .line 54
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 55
    .line 56
    .line 57
    new-instance v1, LS5/o;

    .line 58
    .line 59
    const/16 v2, 0x1b

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-direct {v1, p0, p1, v2, v3}, LS5/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lb5/m0;->v0(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    throw p1
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
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
.end method

.method public final g(I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lb5/l1;->c:Lb5/m1;

    .line 2
    .line 3
    iget-object p1, p1, LD/n;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lb5/n0;

    .line 6
    .line 7
    iget-object v0, p1, Lb5/n0;->j:Lb5/m0;

    .line 8
    .line 9
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lb5/m0;->t0()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, Lb5/n0;->i:Lb5/V;

    .line 16
    .line 17
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "Service connection suspended"

    .line 21
    .line 22
    iget-object v0, v0, Lb5/V;->m:Lb5/T;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p1, Lb5/n0;->j:Lb5/m0;

    .line 28
    .line 29
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, LA4/e;

    .line 33
    .line 34
    const/16 v1, 0xc

    .line 35
    .line 36
    invoke-direct {v0, v1, p0}, LA4/e;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lb5/m0;->v0(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
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
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lb5/l1;->c:Lb5/m1;

    .line 2
    .line 3
    iget-object p1, p1, LD/n;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lb5/n0;

    .line 6
    .line 7
    iget-object p1, p1, Lb5/n0;->j:Lb5/m0;

    .line 8
    .line 9
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lb5/m0;->t0()V

    .line 13
    .line 14
    .line 15
    monitor-enter p0

    .line 16
    const/4 p1, 0x0

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    :try_start_0
    iput-boolean p1, p0, Lb5/l1;->a:Z

    .line 20
    .line 21
    iget-object p1, p0, Lb5/l1;->c:Lb5/m1;

    .line 22
    .line 23
    iget-object p1, p1, LD/n;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lb5/n0;

    .line 26
    .line 27
    iget-object p1, p1, Lb5/n0;->i:Lb5/V;

    .line 28
    .line 29
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p1, Lb5/V;->f:Lb5/T;

    .line 33
    .line 34
    const-string p2, "Service connected with null binder"

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_0
    const/4 v0, 0x0

    .line 45
    :try_start_1
    invoke-interface {p2}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "com.google.android.gms.measurement.internal.IMeasurementService"

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    const-string v1, "com.google.android.gms.measurement.internal.IMeasurementService"

    .line 58
    .line 59
    invoke-interface {p2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    instance-of v2, v1, Lb5/G;

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    check-cast v1, Lb5/G;

    .line 68
    .line 69
    :goto_0
    move-object v0, v1

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    new-instance v1, Lb5/F;

    .line 72
    .line 73
    invoke-direct {v1, p2}, Lb5/F;-><init>(Landroid/os/IBinder;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :goto_1
    iget-object p2, p0, Lb5/l1;->c:Lb5/m1;

    .line 78
    .line 79
    iget-object p2, p2, LD/n;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p2, Lb5/n0;

    .line 82
    .line 83
    iget-object p2, p2, Lb5/n0;->i:Lb5/V;

    .line 84
    .line 85
    invoke-static {p2}, Lb5/n0;->f(Lb5/x0;)V

    .line 86
    .line 87
    .line 88
    iget-object p2, p2, Lb5/V;->n:Lb5/T;

    .line 89
    .line 90
    const-string v1, "Bound to IMeasurementService interface"

    .line 91
    .line 92
    invoke-virtual {p2, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    iget-object p2, p0, Lb5/l1;->c:Lb5/m1;

    .line 97
    .line 98
    iget-object p2, p2, LD/n;->a:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p2, Lb5/n0;

    .line 101
    .line 102
    iget-object p2, p2, Lb5/n0;->i:Lb5/V;

    .line 103
    .line 104
    invoke-static {p2}, Lb5/n0;->f(Lb5/x0;)V

    .line 105
    .line 106
    .line 107
    iget-object p2, p2, Lb5/V;->f:Lb5/T;

    .line 108
    .line 109
    const-string v2, "Got binder with a wrong descriptor"

    .line 110
    .line 111
    invoke-virtual {p2, v1, v2}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :catch_0
    :try_start_2
    iget-object p2, p0, Lb5/l1;->c:Lb5/m1;

    .line 116
    .line 117
    iget-object p2, p2, LD/n;->a:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p2, Lb5/n0;

    .line 120
    .line 121
    iget-object p2, p2, Lb5/n0;->i:Lb5/V;

    .line 122
    .line 123
    invoke-static {p2}, Lb5/n0;->f(Lb5/x0;)V

    .line 124
    .line 125
    .line 126
    iget-object p2, p2, Lb5/V;->f:Lb5/T;

    .line 127
    .line 128
    const-string v1, "Service connect failed to get IMeasurementService"

    .line 129
    .line 130
    invoke-virtual {p2, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_2
    if-nez v0, :cond_3

    .line 134
    .line 135
    iput-boolean p1, p0, Lb5/l1;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    .line 137
    :try_start_3
    invoke-static {}, LJ4/a;->b()LJ4/a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object p2, p0, Lb5/l1;->c:Lb5/m1;

    .line 142
    .line 143
    iget-object v0, p2, LD/n;->a:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, Lb5/n0;

    .line 146
    .line 147
    iget-object v0, v0, Lb5/n0;->a:Landroid/content/Context;

    .line 148
    .line 149
    iget-object p2, p2, Lb5/m1;->c:Lb5/l1;

    .line 150
    .line 151
    invoke-virtual {p1, v0, p2}, LJ4/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_3
    :try_start_4
    iget-object p1, p0, Lb5/l1;->c:Lb5/m1;

    .line 156
    .line 157
    iget-object p1, p1, LD/n;->a:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p1, Lb5/n0;

    .line 160
    .line 161
    iget-object p1, p1, Lb5/n0;->j:Lb5/m0;

    .line 162
    .line 163
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 164
    .line 165
    .line 166
    new-instance p2, Lb5/k1;

    .line 167
    .line 168
    const/4 v1, 0x0

    .line 169
    invoke-direct {p2, p0, v0, v1}, Lb5/k1;-><init>(Lb5/l1;Lb5/G;I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, p2}, Lb5/m0;->v0(Ljava/lang/Runnable;)V

    .line 173
    .line 174
    .line 175
    :catch_1
    :goto_3
    monitor-exit p0

    .line 176
    return-void

    .line 177
    :goto_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 178
    throw p1
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/l1;->c:Lb5/m1;

    .line 2
    .line 3
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lb5/n0;

    .line 6
    .line 7
    iget-object v1, v0, Lb5/n0;->j:Lb5/m0;

    .line 8
    .line 9
    invoke-static {v1}, Lb5/n0;->f(Lb5/x0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lb5/m0;->t0()V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Lb5/n0;->i:Lb5/V;

    .line 16
    .line 17
    invoke-static {v1}, Lb5/n0;->f(Lb5/x0;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "Service disconnected"

    .line 21
    .line 22
    iget-object v1, v1, Lb5/V;->m:Lb5/T;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Lb5/n0;->j:Lb5/m0;

    .line 28
    .line 29
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, LS5/o;

    .line 33
    .line 34
    const/16 v2, 0x1a

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v1, p0, p1, v2, v3}, LS5/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lb5/m0;->v0(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
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
.end method
