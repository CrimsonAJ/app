.class public final synthetic LG0/D;
.super Lkotlin/jvm/internal/g;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, LG0/D;->a:I

    invoke-direct/range {p0 .. p6}, Lkotlin/jvm/internal/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LG0/D;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lz6/c;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/os/Looper;->isCurrentThread()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    xor-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_0
    iget-object v0, v1, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lz6/c;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v2, "threadName"

    .line 46
    .line 47
    invoke-static {v0, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v2, "Firebase Blocking Thread #"

    .line 51
    .line 52
    invoke-static {v0, v2}, LW7/d;->N(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0

    .line 61
    :pswitch_1
    iget-object v0, v1, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lz6/c;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v2, "threadName"

    .line 77
    .line 78
    invoke-static {v0, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v2, "Firebase Background Thread #"

    .line 82
    .line 83
    invoke-static {v0, v2}, LW7/d;->N(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    :pswitch_2
    iget-object v0, v1, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Ld/w;

    .line 95
    .line 96
    invoke-virtual {v0}, Ld/w;->e()V

    .line 97
    .line 98
    .line 99
    sget-object v0, LA7/n;->a:LA7/n;

    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_3
    iget-object v0, v1, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Ld/w;

    .line 105
    .line 106
    invoke-virtual {v0}, Ld/w;->e()V

    .line 107
    .line 108
    .line 109
    sget-object v0, LA7/n;->a:LA7/n;

    .line 110
    .line 111
    return-object v0

    .line 112
    :pswitch_4
    iget-object v0, v1, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v2, v0

    .line 115
    check-cast v2, LG0/E;

    .line 116
    .line 117
    iget-object v0, v2, LG0/E;->a:Ld8/e;

    .line 118
    .line 119
    const/4 v3, 0x0

    .line 120
    if-eqz v0, :cond_6

    .line 121
    .line 122
    invoke-static {v0}, LY7/B;->d(Ld8/e;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, LG0/E;->h()LG0/k;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v4, v0, LG0/k;->i:LG0/o;

    .line 130
    .line 131
    if-eqz v4, :cond_4

    .line 132
    .line 133
    iget-object v0, v4, LG0/o;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 134
    .line 135
    const/4 v5, 0x0

    .line 136
    const/4 v6, 0x1

    .line 137
    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_4

    .line 142
    .line 143
    iget-object v0, v4, LG0/o;->b:LG0/k;

    .line 144
    .line 145
    iget-object v7, v4, LG0/o;->i:LA1/g;

    .line 146
    .line 147
    const-string v8, "observer"

    .line 148
    .line 149
    invoke-static {v7, v8}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object v8, v0, LG0/k;->e:Ljava/util/concurrent/locks/ReentrantLock;

    .line 153
    .line 154
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 155
    .line 156
    .line 157
    :try_start_0
    iget-object v9, v0, LG0/k;->d:Ljava/util/LinkedHashMap;

    .line 158
    .line 159
    invoke-interface {v9, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    check-cast v7, LG0/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 164
    .line 165
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 166
    .line 167
    .line 168
    if-eqz v7, :cond_2

    .line 169
    .line 170
    iget-object v8, v0, LG0/k;->c:LG0/X;

    .line 171
    .line 172
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v7, v7, LG0/t;->b:[I

    .line 176
    .line 177
    iget-object v8, v8, LG0/X;->h:LA6/t;

    .line 178
    .line 179
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-object v9, v8, LA6/t;->b:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v9, Ljava/util/concurrent/locks/ReentrantLock;

    .line 185
    .line 186
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 187
    .line 188
    .line 189
    :try_start_1
    array-length v10, v7

    .line 190
    move v11, v5

    .line 191
    :goto_0
    if-ge v5, v10, :cond_1

    .line 192
    .line 193
    aget v12, v7, v5

    .line 194
    .line 195
    iget-object v13, v8, LA6/t;->c:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v13, [J

    .line 198
    .line 199
    aget-wide v14, v13, v12

    .line 200
    .line 201
    const-wide/16 v16, 0x1

    .line 202
    .line 203
    sub-long v18, v14, v16

    .line 204
    .line 205
    aput-wide v18, v13, v12

    .line 206
    .line 207
    cmp-long v12, v14, v16

    .line 208
    .line 209
    if-nez v12, :cond_0

    .line 210
    .line 211
    iput-boolean v6, v8, LA6/t;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 212
    .line 213
    move v11, v6

    .line 214
    goto :goto_1

    .line 215
    :catchall_0
    move-exception v0

    .line 216
    goto :goto_2

    .line 217
    :cond_0
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_1
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 221
    .line 222
    .line 223
    if-eqz v11, :cond_2

    .line 224
    .line 225
    new-instance v5, LG0/i;

    .line 226
    .line 227
    const/4 v6, 0x0

    .line 228
    invoke-direct {v5, v0, v6}, LG0/i;-><init>(LG0/k;LE7/d;)V

    .line 229
    .line 230
    .line 231
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 232
    .line 233
    .line 234
    new-instance v0, LI0/v;

    .line 235
    .line 236
    invoke-direct {v0, v5, v6}, LI0/v;-><init>(LO7/p;LE7/d;)V

    .line 237
    .line 238
    .line 239
    invoke-static {v0}, LY7/B;->w(LO7/p;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :goto_2
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 244
    .line 245
    .line 246
    throw v0

    .line 247
    :cond_2
    :goto_3
    :try_start_2
    iget-object v0, v4, LG0/o;->g:LG0/f;

    .line 248
    .line 249
    if-eqz v0, :cond_3

    .line 250
    .line 251
    iget-object v5, v4, LG0/o;->j:LG0/m;

    .line 252
    .line 253
    iget v6, v4, LG0/o;->f:I

    .line 254
    .line 255
    invoke-interface {v0, v5, v6}, LG0/f;->i0(LG0/d;I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 256
    .line 257
    .line 258
    goto :goto_4

    .line 259
    :catch_0
    move-exception v0

    .line 260
    const-string v5, "ROOM"

    .line 261
    .line 262
    const-string v6, "Cannot unregister multi-instance invalidation callback"

    .line 263
    .line 264
    invoke-static {v5, v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 265
    .line 266
    .line 267
    :cond_3
    :goto_4
    iget-object v0, v4, LG0/o;->k:LG0/n;

    .line 268
    .line 269
    iget-object v4, v4, LG0/o;->c:Landroid/content/Context;

    .line 270
    .line 271
    invoke-virtual {v4, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 272
    .line 273
    .line 274
    goto :goto_5

    .line 275
    :catchall_1
    move-exception v0

    .line 276
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 277
    .line 278
    .line 279
    throw v0

    .line 280
    :cond_4
    :goto_5
    iget-object v0, v2, LG0/E;->d:LG0/y;

    .line 281
    .line 282
    if-eqz v0, :cond_5

    .line 283
    .line 284
    iget-object v0, v0, LG0/y;->f:LI0/b;

    .line 285
    .line 286
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 287
    .line 288
    .line 289
    sget-object v0, LA7/n;->a:LA7/n;

    .line 290
    .line 291
    return-object v0

    .line 292
    :cond_5
    const-string v0, "connectionManager"

    .line 293
    .line 294
    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw v3

    .line 298
    :cond_6
    const-string v0, "coroutineScope"

    .line 299
    .line 300
    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v3

    .line 304
    nop

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
