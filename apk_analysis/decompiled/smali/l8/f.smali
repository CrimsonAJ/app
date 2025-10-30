.class public final Ll8/f;
.super Lm8/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Ll8/f;->e:I

    iput-object p1, p0, Ll8/f;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p2, p1}, Lm8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Ll8/f;->e:I

    iput-object p2, p0, Ll8/f;->f:Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lm8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method private final b()J
    .locals 13

    .line 1
    iget-object v0, p0, Ll8/f;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb5/W;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-object v3, v0, Lb5/W;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const-wide/high16 v6, -0x8000000000000000L

    .line 20
    .line 21
    move-wide v7, v6

    .line 22
    move-object v6, v5

    .line 23
    move v5, v4

    .line 24
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v9

    .line 28
    if-eqz v9, :cond_2

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    check-cast v9, Ln8/i;

    .line 35
    .line 36
    const-string v10, "connection"

    .line 37
    .line 38
    invoke-static {v9, v10}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    monitor-enter v9

    .line 42
    :try_start_0
    invoke-virtual {v0, v9, v1, v2}, Lb5/W;->b(Ln8/i;J)I

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    if-lez v10, :cond_0

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    iget-wide v10, v9, Ln8/i;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    sub-long v10, v1, v10

    .line 56
    .line 57
    cmp-long v12, v10, v7

    .line 58
    .line 59
    if-lez v12, :cond_1

    .line 60
    .line 61
    move-object v6, v9

    .line 62
    move-wide v7, v10

    .line 63
    :cond_1
    :goto_1
    monitor-exit v9

    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    monitor-exit v9

    .line 67
    throw v0

    .line 68
    :cond_2
    iget-wide v9, v0, Lb5/W;->b:J

    .line 69
    .line 70
    cmp-long v3, v7, v9

    .line 71
    .line 72
    if-gez v3, :cond_6

    .line 73
    .line 74
    const/4 v3, 0x5

    .line 75
    if-le v4, v3, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    if-lez v4, :cond_4

    .line 79
    .line 80
    sub-long/2addr v9, v7

    .line 81
    return-wide v9

    .line 82
    :cond_4
    if-lez v5, :cond_5

    .line 83
    .line 84
    return-wide v9

    .line 85
    :cond_5
    const-wide/16 v0, -0x1

    .line 86
    .line 87
    return-wide v0

    .line 88
    :cond_6
    :goto_2
    invoke-static {v6}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    monitor-enter v6

    .line 92
    :try_start_1
    iget-object v3, v6, Ln8/i;->p:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    const-wide/16 v4, 0x0

    .line 99
    .line 100
    if-nez v3, :cond_7

    .line 101
    .line 102
    monitor-exit v6

    .line 103
    return-wide v4

    .line 104
    :cond_7
    :try_start_2
    iget-wide v9, v6, Ln8/i;->q:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    .line 106
    add-long/2addr v9, v7

    .line 107
    cmp-long v1, v9, v1

    .line 108
    .line 109
    if-eqz v1, :cond_8

    .line 110
    .line 111
    monitor-exit v6

    .line 112
    return-wide v4

    .line 113
    :cond_8
    const/4 v1, 0x1

    .line 114
    :try_start_3
    iput-boolean v1, v6, Ln8/i;->j:Z

    .line 115
    .line 116
    iget-object v1, v0, Lb5/W;->e:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 119
    .line 120
    invoke-virtual {v1, v6}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    .line 122
    .line 123
    monitor-exit v6

    .line 124
    iget-object v1, v6, Ln8/i;->d:Ljava/net/Socket;

    .line 125
    .line 126
    invoke-static {v1}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1}, Lk8/c;->e(Ljava/net/Socket;)V

    .line 130
    .line 131
    .line 132
    iget-object v1, v0, Lb5/W;->e:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_9

    .line 141
    .line 142
    iget-object v0, v0, Lb5/W;->c:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, Lm8/b;

    .line 145
    .line 146
    invoke-virtual {v0}, Lm8/b;->a()V

    .line 147
    .line 148
    .line 149
    :cond_9
    return-wide v4

    .line 150
    :catchall_1
    move-exception v0

    .line 151
    monitor-exit v6

    .line 152
    throw v0
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


# virtual methods
.method public final a()J
    .locals 5

    .line 1
    iget v0, p0, Ll8/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll8/f;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lq8/n;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    :try_start_0
    iget-object v2, v0, Lq8/n;->w:Lq8/w;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v2, v1, v3, v3}, Lq8/w;->F(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v2

    .line 22
    invoke-virtual {v0, v1, v1, v2}, Lq8/n;->a(IILjava/io/IOException;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    const-wide/16 v0, -0x1

    .line 26
    .line 27
    return-wide v0

    .line 28
    :pswitch_0
    invoke-direct {p0}, Ll8/f;->b()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    return-wide v0

    .line 33
    :pswitch_1
    iget-object v0, p0, Ll8/f;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, LM1/w;

    .line 36
    .line 37
    invoke-virtual {v0}, LM1/w;->invoke()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const-wide/16 v0, -0x1

    .line 41
    .line 42
    return-wide v0

    .line 43
    :pswitch_2
    iget-object v0, p0, Ll8/f;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ll8/g;

    .line 46
    .line 47
    monitor-enter v0

    .line 48
    :try_start_1
    iget-boolean v1, v0, Ll8/g;->k:Z

    .line 49
    .line 50
    const-wide/16 v2, -0x1

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-boolean v1, v0, Ll8/g;->l:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_0
    const/4 v1, 0x1

    .line 60
    :try_start_2
    invoke-virtual {v0}, Ll8/g;->h0()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception v1

    .line 65
    goto :goto_5

    .line 66
    :catch_1
    :try_start_3
    iput-boolean v1, v0, Ll8/g;->m:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    .line 68
    :goto_1
    :try_start_4
    invoke-virtual {v0}, Ll8/g;->F()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0}, Ll8/g;->a0()V

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    iput v4, v0, Ll8/g;->h:I
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catch_2
    :try_start_5
    iput-boolean v1, v0, Ll8/g;->n:Z

    .line 82
    .line 83
    new-instance v1, Lx8/e;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Lv4/e;->a(Lx8/G;)Lx8/B;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, v0, Ll8/g;->f:Lx8/B;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 93
    .line 94
    :cond_1
    :goto_2
    monitor-exit v0

    .line 95
    goto :goto_4

    .line 96
    :cond_2
    :goto_3
    monitor-exit v0

    .line 97
    :goto_4
    return-wide v2

    .line 98
    :goto_5
    monitor-exit v0

    .line 99
    throw v1

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method
