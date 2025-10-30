.class public final Lcom/anilab/android/ui/activity/MainActivity;
.super Li/h;
.source "SourceFile"

# interfaces
.implements Lx7/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li/h;",
        "Lx7/b;"
    }
.end annotation


# static fields
.field public static final synthetic j0:I

.field public static final synthetic k0:I


# instance fields
.field public A:Lu0/H;

.field public B:Lcom/google/firebase/messaging/u;

.field public volatile C:Lv7/b;

.field public final D:Ljava/lang/Object;

.field public X:Z

.field public final Y:LY2/r;

.field public final Z:Lf/e;

.field public final f0:Lf/e;

.field public final g0:LA7/l;

.field public final h0:LA7/l;

.field public final i0:LA7/l;

.field public z:LW/g;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Li/h;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->D:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->X:Z

    .line 13
    .line 14
    new-instance v0, LL1/a;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, p0, v1}, LL1/a;-><init>(Li/h;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ld/l;->J(Le/a;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, LL1/o;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, v1}, LL1/o;-><init>(Lcom/anilab/android/ui/activity/MainActivity;I)V

    .line 27
    .line 28
    .line 29
    new-instance v1, LY2/r;

    .line 30
    .line 31
    const-class v2, LL1/S;

    .line 32
    .line 33
    invoke-static {v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, LL1/o;

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-direct {v3, p0, v4}, LL1/o;-><init>(Lcom/anilab/android/ui/activity/MainActivity;I)V

    .line 41
    .line 42
    .line 43
    new-instance v4, LL1/o;

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    invoke-direct {v4, p0, v5}, LL1/o;-><init>(Lcom/anilab/android/ui/activity/MainActivity;I)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v2, v3, v0, v4}, LY2/r;-><init>(Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lcom/anilab/android/ui/activity/MainActivity;->Y:LY2/r;

    .line 53
    .line 54
    new-instance v0, Lg/a;

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 58
    .line 59
    .line 60
    new-instance v1, LC6/a;

    .line 61
    .line 62
    const/16 v2, 0xc

    .line 63
    .line 64
    invoke-direct {v1, v2}, LC6/a;-><init>(I)V

    .line 65
    .line 66
    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v3, "activity_rq#"

    .line 70
    .line 71
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v4, p0, Ld/l;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    iget-object v4, p0, Ld/l;->l:Ld/f;

    .line 88
    .line 89
    invoke-virtual {v4, v2, p0, v0, v1}, Ld/f;->c(Ljava/lang/String;Landroidx/lifecycle/w;Lv4/e;Lf/b;)Lf/e;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->Z:Lf/e;

    .line 94
    .line 95
    new-instance v0, Lg/a;

    .line 96
    .line 97
    const/4 v1, 0x2

    .line 98
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 99
    .line 100
    .line 101
    new-instance v1, LL1/b;

    .line 102
    .line 103
    invoke-direct {v1, p0}, LL1/b;-><init>(Lcom/anilab/android/ui/activity/MainActivity;)V

    .line 104
    .line 105
    .line 106
    new-instance v2, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Ld/l;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget-object v3, p0, Ld/l;->l:Ld/f;

    .line 125
    .line 126
    invoke-virtual {v3, v2, p0, v0, v1}, Ld/f;->c(Ljava/lang/String;Landroidx/lifecycle/w;Lv4/e;Lf/b;)Lf/e;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->f0:Lf/e;

    .line 131
    .line 132
    new-instance v0, LL1/c;

    .line 133
    .line 134
    const/4 v1, 0x0

    .line 135
    invoke-direct {v0, p0, v1}, LL1/c;-><init>(Lcom/anilab/android/ui/activity/MainActivity;I)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->g0:LA7/l;

    .line 143
    .line 144
    new-instance v0, LC2/P;

    .line 145
    .line 146
    const/4 v1, 0x3

    .line 147
    invoke-direct {v0, v1}, LC2/P;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iput-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->h0:LA7/l;

    .line 155
    .line 156
    new-instance v0, LL1/c;

    .line 157
    .line 158
    const/4 v1, 0x1

    .line 159
    invoke-direct {v0, p0, v1}, LL1/c;-><init>(Lcom/anilab/android/ui/activity/MainActivity;I)V

    .line 160
    .line 161
    .line 162
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iput-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->i0:LA7/l;

    .line 167
    .line 168
    return-void
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
.method public final S()Lv7/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->C:Lv7/b;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->D:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/anilab/android/ui/activity/MainActivity;->C:Lv7/b;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lv7/b;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lv7/b;-><init>(Li/h;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/anilab/android/ui/activity/MainActivity;->C:Lv7/b;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->C:Lv7/b;

    .line 27
    .line 28
    return-object v0
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final T()V
    .locals 4

    .line 1
    invoke-static {}, Ls8/e;->D()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lf5/i;

    .line 6
    .line 7
    invoke-direct {v1}, Lf5/i;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, LA6/r;

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    invoke-direct {v2, v0, v3, v1}, LA6/r;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, LL1/b;

    .line 23
    .line 24
    invoke-direct {v0, p0}, LL1/b;-><init>(Lcom/anilab/android/ui/activity/MainActivity;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v1, Lf5/i;->a:Lf5/q;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lf5/q;->k(Lf5/c;)Lf5/q;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final U()Landroid/net/ConnectivityManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->g0:LA7/l;

    .line 2
    .line 3
    invoke-virtual {v0}, LA7/l;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 8
    .line 9
    return-object v0
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

.method public final V()LL1/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->Y:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LL1/S;

    .line 8
    .line 9
    return-object v0
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

.method public final W(Landroid/os/Bundle;Z)V
    .locals 43

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    goto/16 :goto_e

    .line 8
    .line 9
    :cond_0
    const-string v0, "link"

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-static {v0}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    .line 25
    .line 26
    const-string v4, "android.intent.action.VIEW"

    .line 27
    .line 28
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {v3, v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_0
    const-string v0, "children_id"

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const-string v0, "parent_id"

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const-string v0, "313x438"

    .line 56
    .line 57
    const-string v3, "{width}x{height}"

    .line 58
    .line 59
    sget-object v4, LJ2/b;->e:LH7/a;

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    const-string v7, "movie_poster"

    .line 63
    .line 64
    const-string v9, "movie_title"

    .line 65
    .line 66
    const-string v10, "movie_id"

    .line 67
    .line 68
    const-string v11, "movie_type"

    .line 69
    .line 70
    const-string v12, ""

    .line 71
    .line 72
    if-eqz v5, :cond_4

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result v16

    .line 78
    if-nez v16, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    if-eqz v6, :cond_4

    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v16

    .line 87
    if-nez v16, :cond_5

    .line 88
    .line 89
    :cond_4
    :goto_1
    const-wide/16 v16, -0x1

    .line 90
    .line 91
    goto/16 :goto_7

    .line 92
    .line 93
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    const-wide/16 v16, -0x1

    .line 97
    .line 98
    new-instance v13, LB7/b;

    .line 99
    .line 100
    const/4 v14, 0x0

    .line 101
    invoke-direct {v13, v14, v4}, LB7/b;-><init>(ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_6
    invoke-virtual {v13}, LB7/b;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_7

    .line 109
    .line 110
    invoke-virtual {v13}, LB7/b;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    move-object v14, v4

    .line 115
    check-cast v14, LJ2/b;

    .line 116
    .line 117
    iget-object v14, v14, LJ2/b;->a:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v2, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v15

    .line 123
    invoke-virtual {v14, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v14

    .line 127
    if-eqz v14, :cond_6

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_7
    const/4 v4, 0x0

    .line 131
    :goto_2
    check-cast v4, LJ2/b;

    .line 132
    .line 133
    invoke-virtual {v2, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    if-eqz v10, :cond_8

    .line 138
    .line 139
    invoke-static {v10}, LW7/k;->F(Ljava/lang/String;)Ljava/lang/Long;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    goto :goto_3

    .line 144
    :cond_8
    const/4 v10, 0x0

    .line 145
    :goto_3
    if-eqz v10, :cond_18

    .line 146
    .line 147
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 148
    .line 149
    .line 150
    move-result-wide v13

    .line 151
    cmp-long v11, v13, v16

    .line 152
    .line 153
    if-lez v11, :cond_18

    .line 154
    .line 155
    invoke-virtual {v2, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    if-nez v9, :cond_9

    .line 160
    .line 161
    move-object/from16 v23, v12

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_9
    move-object/from16 v23, v9

    .line 165
    .line 166
    :goto_4
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    if-eqz v2, :cond_a

    .line 171
    .line 172
    invoke-static {v2, v3, v0}, LW7/l;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v15

    .line 176
    goto :goto_5

    .line 177
    :cond_a
    const/4 v15, 0x0

    .line 178
    :goto_5
    if-nez v15, :cond_b

    .line 179
    .line 180
    move-object/from16 v22, v12

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_b
    move-object/from16 v22, v15

    .line 184
    .line 185
    :goto_6
    if-nez v4, :cond_c

    .line 186
    .line 187
    sget-object v4, LJ2/b;->c:LJ2/b;

    .line 188
    .line 189
    :cond_c
    move-object/from16 v28, v4

    .line 190
    .line 191
    new-instance v19, Lcom/anilab/domain/model/Movie;

    .line 192
    .line 193
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 194
    .line 195
    .line 196
    move-result-wide v20

    .line 197
    const/16 v40, 0x0

    .line 198
    .line 199
    const/16 v41, 0x0

    .line 200
    .line 201
    const/16 v24, 0x0

    .line 202
    .line 203
    const/16 v25, 0x0

    .line 204
    .line 205
    const/16 v26, 0x0

    .line 206
    .line 207
    const/16 v27, 0x0

    .line 208
    .line 209
    const/16 v29, 0x0

    .line 210
    .line 211
    const/16 v30, 0x0

    .line 212
    .line 213
    const/16 v31, 0x0

    .line 214
    .line 215
    const/16 v32, 0x0

    .line 216
    .line 217
    const-wide/16 v33, 0x0

    .line 218
    .line 219
    const-wide/16 v35, 0x0

    .line 220
    .line 221
    const/16 v37, 0x0

    .line 222
    .line 223
    const/16 v38, 0x0

    .line 224
    .line 225
    const/16 v39, 0x0

    .line 226
    .line 227
    const v42, 0x1fff78

    .line 228
    .line 229
    .line 230
    invoke-direct/range {v19 .. v42}, Lcom/anilab/domain/model/Movie;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILJ2/b;Ljava/lang/String;IIIDJLjava/util/List;ZLjava/lang/String;Ljava/lang/String;ZI)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Lcom/anilab/android/ui/activity/MainActivity;->V()LL1/S;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    new-instance v2, LL1/M;

    .line 238
    .line 239
    const/4 v7, 0x0

    .line 240
    move-object/from16 v4, v19

    .line 241
    .line 242
    invoke-direct/range {v2 .. v7}, LL1/M;-><init>(LL1/S;Lcom/anilab/domain/model/Movie;Ljava/lang/String;Ljava/lang/String;LE7/d;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3, v8, v2}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 246
    .line 247
    .line 248
    goto/16 :goto_e

    .line 249
    .line 250
    :goto_7
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    new-instance v5, LB7/b;

    .line 254
    .line 255
    const/4 v6, 0x0

    .line 256
    invoke-direct {v5, v6, v4}, LB7/b;-><init>(ILjava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    :cond_d
    invoke-virtual {v5}, LB7/b;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-eqz v4, :cond_e

    .line 264
    .line 265
    invoke-virtual {v5}, LB7/b;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    move-object v6, v4

    .line 270
    check-cast v6, LJ2/b;

    .line 271
    .line 272
    iget-object v6, v6, LJ2/b;->a:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v2, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v13

    .line 278
    invoke-virtual {v6, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    if-eqz v6, :cond_d

    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_e
    const/4 v4, 0x0

    .line 286
    :goto_8
    move-object/from16 v28, v4

    .line 287
    .line 288
    check-cast v28, LJ2/b;

    .line 289
    .line 290
    if-eqz v28, :cond_18

    .line 291
    .line 292
    invoke-virtual {v2, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    if-eqz v4, :cond_f

    .line 297
    .line 298
    invoke-static {v4}, LW7/k;->F(Ljava/lang/String;)Ljava/lang/Long;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    goto :goto_9

    .line 303
    :cond_f
    const/4 v4, 0x0

    .line 304
    :goto_9
    if-eqz v4, :cond_18

    .line 305
    .line 306
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 307
    .line 308
    .line 309
    move-result-wide v5

    .line 310
    cmp-long v5, v5, v16

    .line 311
    .line 312
    if-lez v5, :cond_18

    .line 313
    .line 314
    invoke-virtual {v2, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    if-nez v5, :cond_10

    .line 319
    .line 320
    move-object/from16 v23, v12

    .line 321
    .line 322
    goto :goto_a

    .line 323
    :cond_10
    move-object/from16 v23, v5

    .line 324
    .line 325
    :goto_a
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    if-eqz v5, :cond_11

    .line 330
    .line 331
    invoke-static {v5, v3, v0}, LW7/l;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    goto :goto_b

    .line 336
    :cond_11
    const/4 v0, 0x0

    .line 337
    :goto_b
    if-nez v0, :cond_12

    .line 338
    .line 339
    move-object/from16 v22, v12

    .line 340
    .line 341
    goto :goto_c

    .line 342
    :cond_12
    move-object/from16 v22, v0

    .line 343
    .line 344
    :goto_c
    const-string v0, "episode_id"

    .line 345
    .line 346
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    if-eqz v0, :cond_13

    .line 351
    .line 352
    invoke-static {v0}, LW7/k;->F(Ljava/lang/String;)Ljava/lang/Long;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-eqz v0, :cond_13

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 359
    .line 360
    .line 361
    move-result-wide v13

    .line 362
    goto :goto_d

    .line 363
    :cond_13
    move-wide/from16 v13, v16

    .line 364
    .line 365
    :goto_d
    const-string v0, "play"

    .line 366
    .line 367
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    new-instance v17, Lcom/anilab/domain/model/Movie;

    .line 376
    .line 377
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 378
    .line 379
    .line 380
    move-result-wide v20

    .line 381
    const/16 v40, 0x0

    .line 382
    .line 383
    const/16 v41, 0x0

    .line 384
    .line 385
    const/16 v24, 0x0

    .line 386
    .line 387
    const/16 v25, 0x0

    .line 388
    .line 389
    const/16 v26, 0x0

    .line 390
    .line 391
    const/16 v27, 0x0

    .line 392
    .line 393
    const/16 v29, 0x0

    .line 394
    .line 395
    const/16 v30, 0x0

    .line 396
    .line 397
    const/16 v31, 0x0

    .line 398
    .line 399
    const/16 v32, 0x0

    .line 400
    .line 401
    const-wide/16 v33, 0x0

    .line 402
    .line 403
    const-wide/16 v35, 0x0

    .line 404
    .line 405
    const/16 v37, 0x0

    .line 406
    .line 407
    const/16 v38, 0x0

    .line 408
    .line 409
    const/16 v39, 0x0

    .line 410
    .line 411
    const v42, 0x1fff78

    .line 412
    .line 413
    .line 414
    move-object/from16 v19, v17

    .line 415
    .line 416
    invoke-direct/range {v19 .. v42}, Lcom/anilab/domain/model/Movie;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILJ2/b;Ljava/lang/String;IIIDJLjava/util/List;ZLjava/lang/String;Ljava/lang/String;ZI)V

    .line 417
    .line 418
    .line 419
    move-object/from16 v2, v19

    .line 420
    .line 421
    move-object/from16 v12, v22

    .line 422
    .line 423
    move-object/from16 v5, v23

    .line 424
    .line 425
    if-eqz p2, :cond_16

    .line 426
    .line 427
    if-eqz v0, :cond_14

    .line 428
    .line 429
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 430
    .line 431
    .line 432
    move-result-wide v2

    .line 433
    sget-object v0, LB7/t;->a:LB7/t;

    .line 434
    .line 435
    new-instance v4, Landroid/content/Intent;

    .line 436
    .line 437
    const-class v6, Lcom/anilab/android/ui/player/PlayerActivity;

    .line 438
    .line 439
    invoke-direct {v4, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 440
    .line 441
    .line 442
    const-string v6, "extra_id"

    .line 443
    .line 444
    invoke-virtual {v4, v6, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 445
    .line 446
    .line 447
    const-string v2, "extra_name"

    .line 448
    .line 449
    invoke-virtual {v4, v2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 450
    .line 451
    .line 452
    const-string v2, "extra_poster"

    .line 453
    .line 454
    invoke-virtual {v4, v2, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 455
    .line 456
    .line 457
    const-string v2, "extra_episode_id"

    .line 458
    .line 459
    invoke-virtual {v4, v2, v13, v14}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 460
    .line 461
    .line 462
    const-string v2, "extra_year"

    .line 463
    .line 464
    invoke-virtual {v4, v2, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 465
    .line 466
    .line 467
    new-instance v2, Ljava/util/ArrayList;

    .line 468
    .line 469
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 470
    .line 471
    .line 472
    const-string v0, "extra_al_names"

    .line 473
    .line 474
    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 475
    .line 476
    .line 477
    iget-object v0, v1, Lcom/anilab/android/ui/activity/MainActivity;->f0:Lf/e;

    .line 478
    .line 479
    invoke-virtual {v0, v4}, Lf/e;->a(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    goto :goto_e

    .line 483
    :cond_14
    new-instance v0, LI1/n;

    .line 484
    .line 485
    const/4 v3, 0x0

    .line 486
    invoke-direct {v0, v2, v3, v3}, LI1/n;-><init>(Lcom/anilab/domain/model/Movie;Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    :try_start_1
    iget-object v2, v1, Lcom/anilab/android/ui/activity/MainActivity;->A:Lu0/H;

    .line 490
    .line 491
    if-eqz v2, :cond_15

    .line 492
    .line 493
    invoke-virtual {v2, v0}, Lu0/H;->l(Lu0/D;)V

    .line 494
    .line 495
    .line 496
    goto :goto_e

    .line 497
    :cond_15
    const-string v0, "navController"

    .line 498
    .line 499
    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    const/4 v0, 0x0

    .line 503
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 504
    :cond_16
    if-eqz v0, :cond_17

    .line 505
    .line 506
    invoke-virtual {v1}, Lcom/anilab/android/ui/activity/MainActivity;->V()LL1/S;

    .line 507
    .line 508
    .line 509
    move-result-object v20

    .line 510
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 511
    .line 512
    .line 513
    move-result-wide v21

    .line 514
    new-instance v19, LL1/N;

    .line 515
    .line 516
    const/16 v27, 0x0

    .line 517
    .line 518
    move-object/from16 v23, v5

    .line 519
    .line 520
    move-object/from16 v24, v12

    .line 521
    .line 522
    move-wide/from16 v25, v13

    .line 523
    .line 524
    invoke-direct/range {v19 .. v27}, LL1/N;-><init>(LL1/S;JLjava/lang/String;Ljava/lang/String;JLE7/d;)V

    .line 525
    .line 526
    .line 527
    move-object/from16 v2, v19

    .line 528
    .line 529
    move-object/from16 v0, v20

    .line 530
    .line 531
    invoke-virtual {v0, v8, v2}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 532
    .line 533
    .line 534
    goto :goto_e

    .line 535
    :cond_17
    invoke-virtual {v1}, Lcom/anilab/android/ui/activity/MainActivity;->V()LL1/S;

    .line 536
    .line 537
    .line 538
    move-result-object v16

    .line 539
    new-instance v15, LL1/M;

    .line 540
    .line 541
    const/16 v20, 0x0

    .line 542
    .line 543
    const/16 v18, 0x0

    .line 544
    .line 545
    move-object/from16 v19, v18

    .line 546
    .line 547
    move-object/from16 v17, v2

    .line 548
    .line 549
    invoke-direct/range {v15 .. v20}, LL1/M;-><init>(LL1/S;Lcom/anilab/domain/model/Movie;Ljava/lang/String;Ljava/lang/String;LE7/d;)V

    .line 550
    .line 551
    .line 552
    move-object/from16 v0, v16

    .line 553
    .line 554
    invoke-virtual {v0, v8, v15}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 555
    .line 556
    .line 557
    :catch_0
    :cond_18
    :goto_e
    return-void
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method

.method public final X(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Li0/y;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, LW/c;->a:Landroidx/databinding/DataBinderMapperImpl;

    .line 5
    .line 6
    const p1, 0x7f0d001c

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Li/h;->setContentView(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const v1, 0x1020002

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {v0, v1, p1}, LW/c;->a(Landroid/view/ViewGroup;II)LW/g;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "<set-?>"

    .line 35
    .line 36
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/anilab/android/ui/activity/MainActivity;->z:LW/g;

    .line 40
    .line 41
    invoke-virtual {p1, p0}, LW/g;->i0(Landroidx/lifecycle/w;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/anilab/android/ui/activity/MainActivity;->V()LL1/S;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Li0/y;->P()Li0/N;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const v2, 0x7f0a02aa

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v2}, Li0/M;->B(I)Li0/v;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v2, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment"

    .line 59
    .line 60
    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    check-cast p1, Landroidx/navigation/fragment/NavHostFragment;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroidx/navigation/fragment/NavHostFragment;->e0()Lu0/H;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lcom/anilab/android/ui/activity/MainActivity;->A:Lu0/H;

    .line 73
    .line 74
    invoke-static {p0}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v0, LM1/d;

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-direct {v0, v2, p0}, LM1/d;-><init>(LE7/d;Lcom/anilab/android/ui/activity/MainActivity;)V

    .line 82
    .line 83
    .line 84
    const/4 v3, 0x3

    .line 85
    invoke-static {p1, v2, v0, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/measurement/Y1;->E(Landroid/view/Window;Z)V

    .line 93
    .line 94
    .line 95
    sget-object p1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 96
    .line 97
    invoke-static {p1}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/anilab/android/ui/activity/MainActivity;->T()V

    .line 101
    .line 102
    .line 103
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 104
    .line 105
    const/16 v0, 0x18

    .line 106
    .line 107
    iget-object v4, p0, Lcom/anilab/android/ui/activity/MainActivity;->i0:LA7/l;

    .line 108
    .line 109
    if-lt p1, v0, :cond_0

    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/anilab/android/ui/activity/MainActivity;->U()Landroid/net/ConnectivityManager;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v4}, LA7/l;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, LL1/f;

    .line 120
    .line 121
    invoke-static {v0, v4}, LC3/d;->u(Landroid/net/ConnectivityManager;LL1/f;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    invoke-virtual {p0}, Lcom/anilab/android/ui/activity/MainActivity;->U()Landroid/net/ConnectivityManager;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v5, p0, Lcom/anilab/android/ui/activity/MainActivity;->h0:LA7/l;

    .line 130
    .line 131
    invoke-virtual {v5}, LA7/l;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, Landroid/net/NetworkRequest;

    .line 136
    .line 137
    invoke-virtual {v4}, LA7/l;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, LL1/f;

    .line 142
    .line 143
    invoke-virtual {v0, v5, v4}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 144
    .line 145
    .line 146
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-eqz v0, :cond_1

    .line 151
    .line 152
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    goto :goto_1

    .line 157
    :cond_1
    move-object v0, v2

    .line 158
    :goto_1
    invoke-virtual {p0, v0, v1}, Lcom/anilab/android/ui/activity/MainActivity;->W(Landroid/os/Bundle;Z)V

    .line 159
    .line 160
    .line 161
    invoke-static {p0}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v1, LL1/n;

    .line 166
    .line 167
    invoke-direct {v1, v2, p0}, LL1/n;-><init>(LE7/d;Lcom/anilab/android/ui/activity/MainActivity;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 171
    .line 172
    .line 173
    const/16 v0, 0x21

    .line 174
    .line 175
    if-lt p1, v0, :cond_2

    .line 176
    .line 177
    const-string p1, "android.permission.POST_NOTIFICATIONS"

    .line 178
    .line 179
    invoke-static {p0, p1}, LE/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_2

    .line 184
    .line 185
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_2

    .line 190
    .line 191
    iget-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->Z:Lf/e;

    .line 192
    .line 193
    invoke-virtual {v0, p1}, Lf/e;->a(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_2
    return-void
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
.end method

.method public final Y()V
    .locals 2

    .line 1
    invoke-super {p0}, Li/h;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->B:Lcom/google/firebase/messaging/u;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, v0, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 10
    .line 11
    :cond_0
    return-void
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

.method public final Z(LM1/E;)V
    .locals 2

    .line 1
    const-string v0, "uiText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, LM1/C;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, LM1/C;

    .line 11
    .line 12
    iget-object p1, p1, LM1/C;->a:Ljava/lang/String;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p1, LM1/D;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    check-cast p1, LM1/D;

    .line 20
    .line 21
    iget p1, p1, LM1/D;->a:I

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "getString(...)"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object v0, p0, Lcom/anilab/android/ui/activity/MainActivity;->z:LW/g;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v0, v0, LW/g;->k:Landroid/view/View;

    .line 37
    .line 38
    invoke-static {v0, p1}, LI5/l;->g(Landroid/view/View;Ljava/lang/String;)LI5/l;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, LM1/a;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-direct {v0, v1}, LM1/a;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, LI5/l;->h(Landroid/view/View$OnClickListener;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, LI5/l;->i()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    const-string p1, "binding"

    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    throw p1

    .line 62
    :cond_2
    new-instance p1, LA7/b;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 65
    .line 66
    .line 67
    throw p1
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

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    instance-of v1, v0, Landroid/widget/EditText;

    .line 8
    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    const-string v1, "<this>"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    new-array v2, v1, [I

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Landroid/graphics/Point;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    aget v5, v2, v4

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    aget v2, v2, v6

    .line 29
    .line 30
    invoke-direct {v3, v5, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Landroid/graphics/PointF;

    .line 34
    .line 35
    invoke-direct {v2, v3}, Landroid/graphics/PointF;-><init>(Landroid/graphics/Point;)V

    .line 36
    .line 37
    .line 38
    check-cast v0, Landroid/widget/EditText;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    int-to-float v3, v3

    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    int-to-float v5, v5

    .line 50
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    int-to-float v7, v7

    .line 57
    add-float/2addr v7, v2

    .line 58
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    iget-object v9, p0, Lcom/anilab/android/ui/activity/MainActivity;->z:LW/g;

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    if-eqz v9, :cond_3

    .line 66
    .line 67
    check-cast v9, LJ1/a;

    .line 68
    .line 69
    iget-object v9, v9, LW/g;->k:Landroid/view/View;

    .line 70
    .line 71
    const-string v11, "getRoot(...)"

    .line 72
    .line 73
    invoke-static {v9, v11}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-array v1, v1, [I

    .line 77
    .line 78
    invoke-virtual {v9, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 79
    .line 80
    .line 81
    new-instance v9, Landroid/graphics/Point;

    .line 82
    .line 83
    aget v11, v1, v4

    .line 84
    .line 85
    aget v1, v1, v6

    .line 86
    .line 87
    invoke-direct {v9, v11, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 88
    .line 89
    .line 90
    iget v1, v9, Landroid/graphics/Point;->y:I

    .line 91
    .line 92
    int-to-float v1, v1

    .line 93
    add-float/2addr v8, v1

    .line 94
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    cmpl-float v3, v1, v3

    .line 99
    .line 100
    if-ltz v3, :cond_0

    .line 101
    .line 102
    cmpg-float v1, v1, v5

    .line 103
    .line 104
    if-gtz v1, :cond_0

    .line 105
    .line 106
    cmpl-float v1, v8, v2

    .line 107
    .line 108
    if-ltz v1, :cond_0

    .line 109
    .line 110
    cmpg-float v1, v8, v7

    .line 111
    .line 112
    if-gtz v1, :cond_0

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const-string v2, "input_method"

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    instance-of v2, v1, Landroid/view/inputmethod/InputMethodManager;

    .line 126
    .line 127
    if-eqz v2, :cond_1

    .line 128
    .line 129
    move-object v10, v1

    .line 130
    check-cast v10, Landroid/view/inputmethod/InputMethodManager;

    .line 131
    .line 132
    :cond_1
    if-eqz v10, :cond_2

    .line 133
    .line 134
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v10, v1, v4}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 139
    .line 140
    .line 141
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_3
    const-string p1, "binding"

    .line 146
    .line 147
    invoke-static {p1}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v10

    .line 151
    :cond_4
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    return p1
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
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/anilab/android/ui/activity/MainActivity;->S()Lv7/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lv7/b;->e()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public final j()Landroidx/lifecycle/h0;
    .locals 4

    .line 1
    invoke-super {p0}, Ld/l;->j()Landroidx/lifecycle/h0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lu7/a;

    .line 6
    .line 7
    invoke-static {v1, p0}, Lv4/e;->p(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lu7/a;

    .line 12
    .line 13
    check-cast v1, LI1/e;

    .line 14
    .line 15
    invoke-virtual {v1}, LI1/e;->a()Lk4/E;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Lu7/e;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v3, v1, Lk4/E;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, LA1/g;

    .line 27
    .line 28
    iget-object v1, v1, Lk4/E;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lk4/v;

    .line 31
    .line 32
    invoke-direct {v2, v1, v0, v3}, Lu7/e;-><init>(Lk4/v;Landroidx/lifecycle/h0;LA1/g;)V

    .line 33
    .line 34
    .line 35
    return-object v2
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/anilab/android/ui/activity/MainActivity;->X(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    instance-of p1, p1, Lx7/b;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/anilab/android/ui/activity/MainActivity;->S()Lv7/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p1, p1, Lv7/b;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lv7/b;

    .line 19
    .line 20
    iget-object v0, p1, Lv7/b;->c:Ld/l;

    .line 21
    .line 22
    iget-object p1, p1, Lv7/b;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Ld/l;

    .line 25
    .line 26
    new-instance v1, Landroid/support/v4/media/session/y;

    .line 27
    .line 28
    new-instance v2, Lm0/c;

    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    invoke-direct {v2, v3, p1}, Lm0/c;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, v0, v2}, Landroid/support/v4/media/session/y;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/h0;)V

    .line 35
    .line 36
    .line 37
    const-class p1, Lv7/d;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/y;->J(Ljava/lang/Class;)Landroidx/lifecycle/e0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lv7/d;

    .line 44
    .line 45
    iget-object p1, p1, Lv7/d;->e:Lcom/google/firebase/messaging/u;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/anilab/android/ui/activity/MainActivity;->B:Lcom/google/firebase/messaging/u;

    .line 48
    .line 49
    iget-object v0, p1, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lm0/d;

    .line 52
    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0}, Ld/l;->p()Lm0/d;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p1, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 60
    .line 61
    :cond_0
    return-void
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

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/anilab/android/ui/activity/MainActivity;->U()Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/anilab/android/ui/activity/MainActivity;->i0:LA7/l;

    .line 6
    .line 7
    invoke-virtual {v1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, LL1/f;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/anilab/android/ui/activity/MainActivity;->Y()V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Ld/l;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, p1, v0}, Lcom/anilab/android/ui/activity/MainActivity;->W(Landroid/os/Bundle;Z)V

    .line 14
    .line 15
    .line 16
    return-void
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
