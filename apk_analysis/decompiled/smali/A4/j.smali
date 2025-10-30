.class public final synthetic LA4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA4/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;Landroid/content/Context;Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, LA4/j;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA4/j;->c:Ljava/lang/Object;

    iput-object p2, p0, LA4/j;->b:Ljava/lang/Object;

    iput-object p3, p0, LA4/j;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LP/f0;LO0/c;Landroid/animation/ValueAnimator;)V
    .locals 0

    const/4 p2, 0x3

    iput p2, p0, LA4/j;->a:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA4/j;->b:Ljava/lang/Object;

    iput-object p3, p0, LA4/j;->c:Ljava/lang/Object;

    iput-object p4, p0, LA4/j;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf1/k;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, LA4/j;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LA4/j;->c:Ljava/lang/Object;

    iput-object p2, p0, LA4/j;->d:Ljava/lang/Object;

    .line 6
    new-instance p1, Lp1/j;

    .line 7
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, LA4/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LA4/j;->a:I

    iput-object p1, p0, LA4/j;->b:Ljava/lang/Object;

    iput-object p2, p0, LA4/j;->c:Ljava/lang/Object;

    iput-object p3, p0, LA4/j;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 3
    iput p4, p0, LA4/j;->a:I

    iput-object p1, p0, LA4/j;->d:Ljava/lang/Object;

    iput-object p2, p0, LA4/j;->b:Ljava/lang/Object;

    iput-object p3, p0, LA4/j;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 6

    .line 1
    iget-object v0, p0, LA4/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA4/a;

    .line 4
    .line 5
    const-string v1, "google.message_id"

    .line 6
    .line 7
    iget-object v2, v0, LA4/a;->a:Landroid/content/Intent;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v1, "message_id"

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-static {v2}, Ls8/n;->p(Ljava/lang/Object;)Lf5/q;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance v1, Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v3, "google.message_id"

    .line 39
    .line 40
    iget-object v4, v0, LA4/a;->a:Landroid/content/Intent;

    .line 41
    .line 42
    invoke-virtual {v4, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    const-string v3, "message_id"

    .line 49
    .line 50
    invoke-virtual {v4, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    :cond_2
    const-string v4, "google.message_id"

    .line 55
    .line 56
    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v0, LA4/a;->a:Landroid/content/Intent;

    .line 60
    .line 61
    const-string v3, "google.product_id"

    .line 62
    .line 63
    invoke-virtual {v0, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    :cond_3
    if-eqz v2, :cond_4

    .line 79
    .line 80
    const-string v0, "google.product_id"

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    :cond_4
    const-string v0, "supports_message_handled"

    .line 90
    .line 91
    const/4 v2, 0x1

    .line 92
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, LA4/j;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Landroid/content/Context;

    .line 98
    .line 99
    invoke-static {v0}, LA4/q;->b(Landroid/content/Context;)LA4/q;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v2, LA4/o;

    .line 104
    .line 105
    monitor-enter v0

    .line 106
    :try_start_0
    iget v3, v0, LA4/q;->a:I

    .line 107
    .line 108
    add-int/lit8 v4, v3, 0x1

    .line 109
    .line 110
    iput v4, v0, LA4/q;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    monitor-exit v0

    .line 113
    const/4 v4, 0x2

    .line 114
    const/4 v5, 0x0

    .line 115
    invoke-direct {v2, v3, v4, v1, v5}, LA4/o;-><init>(IILandroid/os/Bundle;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v2}, LA4/q;->c(LA4/o;)Lf5/q;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    :goto_0
    sget-object v1, LA4/i;->b:LA4/i;

    .line 123
    .line 124
    new-instance v2, Ls4/i;

    .line 125
    .line 126
    iget-object v3, p0, LA4/j;->d:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v3, Ljava/util/concurrent/CountDownLatch;

    .line 129
    .line 130
    invoke-direct {v2, v3}, Ls4/i;-><init>(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1, v2}, Lf5/q;->b(Ljava/util/concurrent/Executor;Lf5/c;)Lf5/q;

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :catchall_0
    move-exception v1

    .line 138
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    throw v1
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

.method private final b()V
    .locals 5

    .line 1
    iget-object v0, p0, LA4/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, LA4/j;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lb5/m1;

    .line 9
    .line 10
    iget-object v2, v1, LD/n;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lb5/n0;

    .line 13
    .line 14
    iget-object v3, v2, Lb5/n0;->h:Lb5/e0;

    .line 15
    .line 16
    invoke-static {v3}, Lb5/n0;->d(LD/n;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Lb5/e0;->s0()Lb5/C0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, Lb5/B0;->c:Lb5/B0;

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Lb5/C0;->k(Lb5/B0;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    iget-object v3, v2, Lb5/n0;->i:Lb5/V;

    .line 32
    .line 33
    invoke-static {v3}, Lb5/n0;->f(Lb5/x0;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v3, Lb5/V;->k:Lb5/T;

    .line 37
    .line 38
    const-string v4, "Analytics storage consent denied; will not get app instance id"

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Lb5/T;->b(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v1, LD/n;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lb5/n0;

    .line 46
    .line 47
    iget-object v1, v1, Lb5/n0;->p:Lb5/S0;

    .line 48
    .line 49
    invoke-static {v1}, Lb5/n0;->e(Lb5/B;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v1, Lb5/S0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, v2, Lb5/n0;->h:Lb5/e0;

    .line 59
    .line 60
    invoke-static {v1}, Lb5/n0;->d(LD/n;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v1, Lb5/e0;->h:LA6/t;

    .line 64
    .line 65
    invoke-virtual {v1, v3}, LA6/t;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 69
    .line 70
    .line 71
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 72
    .line 73
    .line 74
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    return-void

    .line 76
    :catchall_0
    move-exception v1

    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :catchall_1
    move-exception v1

    .line 80
    goto :goto_4

    .line 81
    :catch_0
    move-exception v1

    .line 82
    goto :goto_2

    .line 83
    :cond_0
    :try_start_2
    iget-object v3, v1, Lb5/m1;->d:Lb5/G;

    .line 84
    .line 85
    if-nez v3, :cond_1

    .line 86
    .line 87
    iget-object v1, v2, Lb5/n0;->i:Lb5/V;

    .line 88
    .line 89
    invoke-static {v1}, Lb5/n0;->f(Lb5/x0;)V

    .line 90
    .line 91
    .line 92
    iget-object v1, v1, Lb5/V;->f:Lb5/T;

    .line 93
    .line 94
    const-string v2, "Failed to get app instance id"

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Lb5/T;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    .line 98
    .line 99
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    :try_start_4
    iget-object v4, p0, LA4/j;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v4, Lb5/Q1;

    .line 106
    .line 107
    invoke-interface {v3, v4}, Lb5/G;->D0(Lb5/Q1;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v3, :cond_2

    .line 121
    .line 122
    iget-object v4, v1, LD/n;->a:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v4, Lb5/n0;

    .line 125
    .line 126
    iget-object v4, v4, Lb5/n0;->p:Lb5/S0;

    .line 127
    .line 128
    invoke-static {v4}, Lb5/n0;->e(Lb5/B;)V

    .line 129
    .line 130
    .line 131
    iget-object v4, v4, Lb5/S0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 132
    .line 133
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-object v2, v2, Lb5/n0;->h:Lb5/e0;

    .line 137
    .line 138
    invoke-static {v2}, Lb5/n0;->d(LD/n;)V

    .line 139
    .line 140
    .line 141
    iget-object v2, v2, Lb5/e0;->h:LA6/t;

    .line 142
    .line 143
    invoke-virtual {v2, v3}, LA6/t;->n(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_2
    invoke-virtual {v1}, Lb5/m1;->B0()V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 147
    .line 148
    .line 149
    :try_start_5
    iget-object v1, p0, LA4/j;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 152
    .line 153
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :goto_2
    :try_start_6
    iget-object v2, p0, LA4/j;->d:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v2, Lb5/m1;

    .line 160
    .line 161
    iget-object v2, v2, LD/n;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, Lb5/n0;

    .line 164
    .line 165
    iget-object v2, v2, Lb5/n0;->i:Lb5/V;

    .line 166
    .line 167
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 168
    .line 169
    .line 170
    iget-object v2, v2, Lb5/V;->f:Lb5/T;

    .line 171
    .line 172
    const-string v3, "Failed to get app instance id"

    .line 173
    .line 174
    invoke-virtual {v2, v1, v3}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 175
    .line 176
    .line 177
    :try_start_7
    iget-object v1, p0, LA4/j;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :goto_3
    monitor-exit v0

    .line 183
    return-void

    .line 184
    :goto_4
    iget-object v2, p0, LA4/j;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 189
    .line 190
    .line 191
    throw v1

    .line 192
    :goto_5
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 193
    throw v1
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

.method private final c()V
    .locals 11

    .line 1
    iget-object v0, p0, LA4/j;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/BroadcastReceiver$PendingResult;

    .line 4
    .line 5
    iget-object v1, p0, LA4/j;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    iget-object v2, p0, LA4/j;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroid/content/Intent;

    .line 12
    .line 13
    const-string v3, "Updating proxies: BatteryNotLowProxy enabled ("

    .line 14
    .line 15
    :try_start_0
    const-string v4, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const-string v6, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    .line 23
    .line 24
    invoke-virtual {v2, v6, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const-string v7, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    .line 29
    .line 30
    invoke-virtual {v2, v7, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const-string v8, "KEY_NETWORK_STATE_PROXY_ENABLED"

    .line 35
    .line 36
    invoke-virtual {v2, v8, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    sget-object v9, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:Ljava/lang/String;

    .line 45
    .line 46
    new-instance v10, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v10, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v3, "), BatteryChargingProxy enabled ("

    .line 55
    .line 56
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v3, "), StorageNotLowProxy ("

    .line 63
    .line 64
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v3, "), NetworkStateProxy enabled ("

    .line 71
    .line 72
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v3, ")"

    .line 79
    .line 80
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    new-array v5, v5, [Ljava/lang/Throwable;

    .line 88
    .line 89
    invoke-virtual {v8, v9, v3, v5}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    const-class v3, Landroidx/work/impl/background/systemalarm/ConstraintProxy$BatteryNotLowProxy;

    .line 93
    .line 94
    invoke-static {v1, v3, v4}, Lo1/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 95
    .line 96
    .line 97
    const-class v3, Landroidx/work/impl/background/systemalarm/ConstraintProxy$BatteryChargingProxy;

    .line 98
    .line 99
    invoke-static {v1, v3, v6}, Lo1/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 100
    .line 101
    .line 102
    const-class v3, Landroidx/work/impl/background/systemalarm/ConstraintProxy$StorageNotLowProxy;

    .line 103
    .line 104
    invoke-static {v1, v3, v7}, Lo1/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 105
    .line 106
    .line 107
    const-class v3, Landroidx/work/impl/background/systemalarm/ConstraintProxy$NetworkStateProxy;

    .line 108
    .line 109
    invoke-static {v1, v3, v2}, Lo1/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :catchall_0
    move-exception v1

    .line 117
    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 118
    .line 119
    .line 120
    throw v1
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
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

.method private final d()V
    .locals 4

    .line 1
    iget-object v0, p0, LA4/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LA4/j;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LG6/e;->l(Ljava/lang/String;)Ln1/j;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Ln1/j;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, LA4/j;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lm1/a;

    .line 28
    .line 29
    iget-object v1, v1, Lm1/a;->c:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_0
    iget-object v2, p0, LA4/j;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lm1/a;

    .line 35
    .line 36
    iget-object v2, v2, Lm1/a;->f:Ljava/util/HashMap;

    .line 37
    .line 38
    iget-object v3, p0, LA4/j;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, LA4/j;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Lm1/a;

    .line 48
    .line 49
    iget-object v2, v2, Lm1/a;->g:Ljava/util/HashSet;

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, LA4/j;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lm1/a;

    .line 57
    .line 58
    iget-object v2, v0, Lm1/a;->h:Lj1/c;

    .line 59
    .line 60
    iget-object v0, v0, Lm1/a;->g:Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Lj1/c;->c(Ljava/util/Collection;)V

    .line 63
    .line 64
    .line 65
    monitor-exit v1

    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    throw v0

    .line 70
    :cond_0
    return-void
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

.method private final e()V
    .locals 4

    .line 1
    iget-object v0, p0, LA4/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt4/z;

    .line 4
    .line 5
    iget-object v1, v0, Lt4/z;->f:Lt4/A;

    .line 6
    .line 7
    iget-object v1, v1, Lt4/A;->C:Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object v2, p0, LA4/j;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lt4/f;

    .line 19
    .line 20
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, LA4/j;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v0, v0, Lt4/z;->f:Lt4/A;

    .line 28
    .line 29
    iget-object v0, v0, Lt4/A;->A:Lcom/google/android/gms/cast/CastDevice;

    .line 30
    .line 31
    check-cast v3, Lv4/h;

    .line 32
    .line 33
    invoke-virtual {v3, v1}, Lv4/h;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    sget-object v0, Lt4/A;->G:Ly4/b;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    aput-object v2, v1, v3

    .line 44
    .line 45
    const-string v2, "Discarded message for unknown namespace \'%s\'"

    .line 46
    .line 47
    invoke-virtual {v0, v2, v1}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw v0
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


# virtual methods
.method public f()Ljava/util/List;
    .locals 14

    .line 1
    iget-object v0, p0, LA4/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf1/k;

    .line 4
    .line 5
    iget-object v0, v0, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v1, "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-static {v2, v1}, LG0/G;->a(ILjava/lang/String;)LG0/G;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v3, p0, LA4/j;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1, v2}, LG0/G;->t(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v1, v2, v3}, LG0/G;->m(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v3, v0, LG6/e;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 37
    .line 38
    invoke-virtual {v3}, LG0/E;->b()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, LG0/E;->c()V

    .line 42
    .line 43
    .line 44
    :try_start_0
    invoke-static {v3, v1, v2}, Ls8/n;->w(LG0/E;LG0/G;Z)Landroid/database/Cursor;

    .line 45
    .line 46
    .line 47
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    :try_start_1
    const-string v4, "id"

    .line 49
    .line 50
    invoke-static {v2, v4}, Ls8/e;->z(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const-string v5, "state"

    .line 55
    .line 56
    invoke-static {v2, v5}, Ls8/e;->z(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    const-string v6, "output"

    .line 61
    .line 62
    invoke-static {v2, v6}, Ls8/e;->z(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    const-string v7, "run_attempt_count"

    .line 67
    .line 68
    invoke-static {v2, v7}, Ls8/e;->z(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    new-instance v8, Ls/e;

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    invoke-direct {v8, v9}, Ls/i;-><init>(I)V

    .line 76
    .line 77
    .line 78
    new-instance v10, Ls/e;

    .line 79
    .line 80
    invoke-direct {v10, v9}, Ls/i;-><init>(I)V

    .line 81
    .line 82
    .line 83
    :cond_1
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    if-eqz v9, :cond_3

    .line 88
    .line 89
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    if-nez v9, :cond_2

    .line 94
    .line 95
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-virtual {v8, v9}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    check-cast v11, Ljava/util/ArrayList;

    .line 104
    .line 105
    if-nez v11, :cond_2

    .line 106
    .line 107
    new-instance v11, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v8, v9, v11}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    goto/16 :goto_7

    .line 118
    .line 119
    :cond_2
    :goto_2
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    if-nez v9, :cond_1

    .line 124
    .line 125
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-virtual {v10, v9}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    check-cast v11, Ljava/util/ArrayList;

    .line 134
    .line 135
    if-nez v11, :cond_1

    .line 136
    .line 137
    new-instance v11, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v10, v9, v11}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    const/4 v9, -0x1

    .line 147
    invoke-interface {v2, v9}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v8}, LG6/e;->b(Ls/e;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v10}, LG6/e;->a(Ls/e;)V

    .line 154
    .line 155
    .line 156
    new-instance v0, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    invoke-direct {v0, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    :goto_3
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    if-eqz v9, :cond_8

    .line 170
    .line 171
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    const/4 v11, 0x0

    .line 176
    if-nez v9, :cond_4

    .line 177
    .line 178
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    invoke-virtual {v8, v9}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    check-cast v9, Ljava/util/ArrayList;

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_4
    move-object v9, v11

    .line 190
    :goto_4
    if-nez v9, :cond_5

    .line 191
    .line 192
    new-instance v9, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    :cond_5
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    if-nez v12, :cond_6

    .line 202
    .line 203
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    invoke-virtual {v10, v11}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    check-cast v11, Ljava/util/ArrayList;

    .line 212
    .line 213
    :cond_6
    if-nez v11, :cond_7

    .line 214
    .line 215
    new-instance v11, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 218
    .line 219
    .line 220
    :cond_7
    new-instance v12, Ln1/i;

    .line 221
    .line 222
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v13

    .line 229
    iput-object v13, v12, Ln1/i;->a:Ljava/lang/String;

    .line 230
    .line 231
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 232
    .line 233
    .line 234
    move-result v13

    .line 235
    invoke-static {v13}, Lcom/google/android/gms/internal/measurement/D1;->z(I)I

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    iput v13, v12, Ln1/i;->b:I

    .line 240
    .line 241
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getBlob(I)[B

    .line 242
    .line 243
    .line 244
    move-result-object v13

    .line 245
    invoke-static {v13}, Le1/h;->a([B)Le1/h;

    .line 246
    .line 247
    .line 248
    move-result-object v13

    .line 249
    iput-object v13, v12, Ln1/i;->c:Le1/h;

    .line 250
    .line 251
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 252
    .line 253
    .line 254
    move-result v13

    .line 255
    iput v13, v12, Ln1/i;->d:I

    .line 256
    .line 257
    iput-object v9, v12, Ln1/i;->e:Ljava/util/ArrayList;

    .line 258
    .line 259
    iput-object v11, v12, Ln1/i;->f:Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_8
    invoke-virtual {v3}, LG0/E;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 266
    .line 267
    .line 268
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1}, LG0/G;->g()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3}, LG0/E;->m()V

    .line 275
    .line 276
    .line 277
    sget-object v1, Ln1/j;->t:Ld0/o;

    .line 278
    .line 279
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    check-cast v0, Ljava/util/List;

    .line 283
    .line 284
    new-instance v1, Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 291
    .line 292
    .line 293
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-eqz v2, :cond_a

    .line 302
    .line 303
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    check-cast v2, Ln1/i;

    .line 308
    .line 309
    iget-object v3, v2, Ln1/i;->f:Ljava/util/ArrayList;

    .line 310
    .line 311
    if-eqz v3, :cond_9

    .line 312
    .line 313
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-nez v3, :cond_9

    .line 318
    .line 319
    iget-object v3, v2, Ln1/i;->f:Ljava/util/ArrayList;

    .line 320
    .line 321
    const/4 v4, 0x0

    .line 322
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    check-cast v3, Le1/h;

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_9
    sget-object v3, Le1/h;->c:Le1/h;

    .line 330
    .line 331
    :goto_6
    new-instance v4, Le1/x;

    .line 332
    .line 333
    iget-object v5, v2, Ln1/i;->a:Ljava/lang/String;

    .line 334
    .line 335
    invoke-static {v5}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    iget v6, v2, Ln1/i;->b:I

    .line 340
    .line 341
    iget-object v7, v2, Ln1/i;->c:Le1/h;

    .line 342
    .line 343
    iget-object v8, v2, Ln1/i;->e:Ljava/util/ArrayList;

    .line 344
    .line 345
    iget v2, v2, Ln1/i;->d:I

    .line 346
    .line 347
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 348
    .line 349
    .line 350
    iput-object v5, v4, Le1/x;->a:Ljava/util/UUID;

    .line 351
    .line 352
    iput v6, v4, Le1/x;->b:I

    .line 353
    .line 354
    iput-object v7, v4, Le1/x;->c:Le1/h;

    .line 355
    .line 356
    new-instance v5, Ljava/util/HashSet;

    .line 357
    .line 358
    invoke-direct {v5, v8}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 359
    .line 360
    .line 361
    iput-object v5, v4, Le1/x;->d:Ljava/util/HashSet;

    .line 362
    .line 363
    iput-object v3, v4, Le1/x;->e:Le1/h;

    .line 364
    .line 365
    iput v2, v4, Le1/x;->f:I

    .line 366
    .line 367
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_a
    check-cast v1, Ljava/util/List;

    .line 372
    .line 373
    return-object v1

    .line 374
    :catchall_1
    move-exception v0

    .line 375
    goto :goto_8

    .line 376
    :goto_7
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1}, LG0/G;->g()V

    .line 380
    .line 381
    .line 382
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 383
    :goto_8
    invoke-virtual {v3}, LG0/E;->m()V

    .line 384
    .line 385
    .line 386
    throw v0
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
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
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
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

.method public final run()V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x3

    .line 4
    const/4 v0, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    iget v6, v1, LA4/j;->a:I

    .line 9
    .line 10
    packed-switch v6, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, LA4/j;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ly4/v;

    .line 16
    .line 17
    iget-object v2, v0, Ly4/v;->D:Ljava/util/HashMap;

    .line 18
    .line 19
    monitor-enter v2

    .line 20
    :try_start_0
    iget-object v0, v0, Ly4/v;->D:Ljava/util/HashMap;

    .line 21
    .line 22
    iget-object v3, v1, LA4/j;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lt4/f;

    .line 31
    .line 32
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v2, v1, LA4/j;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    check-cast v0, Lv4/h;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lv4/h;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v0, v1, LA4/j;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    sget-object v2, Ly4/v;->r0:Ly4/b;

    .line 50
    .line 51
    new-array v3, v5, [Ljava/lang/Object;

    .line 52
    .line 53
    aput-object v0, v3, v4

    .line 54
    .line 55
    const-string v0, "Discarded message for unknown namespace \'%s\'"

    .line 56
    .line 57
    invoke-virtual {v2, v0, v3}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    return-void

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw v0

    .line 64
    :pswitch_0
    invoke-direct {v1}, LA4/j;->e()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_1
    iget-object v0, v1, LA4/j;->b:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v2, v0

    .line 71
    check-cast v2, Lp1/j;

    .line 72
    .line 73
    :try_start_2
    invoke-virtual {v1}, LA4/j;->f()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v2, v0}, Lp1/j;->j(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    invoke-virtual {v2, v0}, Lp1/j;->k(Ljava/lang/Throwable;)Z

    .line 83
    .line 84
    .line 85
    :goto_1
    return-void

    .line 86
    :pswitch_2
    iget-object v0, v1, LA4/j;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lf1/k;

    .line 89
    .line 90
    iget-object v0, v0, Lf1/k;->m:Lf1/b;

    .line 91
    .line 92
    iget-object v2, v1, LA4/j;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v2, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v3, v1, LA4/j;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Lb5/G1;

    .line 99
    .line 100
    invoke-virtual {v0, v2, v3}, Lf1/b;->h(Ljava/lang/String;Lb5/G1;)Z

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_3
    invoke-direct {v1}, LA4/j;->d()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_4
    invoke-direct {v1}, LA4/j;->c()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_5
    iget-object v2, v1, LA4/j;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Ljava/lang/String;

    .line 115
    .line 116
    iget-object v3, v1, LA4/j;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v3, Lf1/l;

    .line 119
    .line 120
    :try_start_3
    iget-object v6, v1, LA4/j;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v6, Lp1/j;

    .line 123
    .line 124
    invoke-virtual {v6}, Lp1/h;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    check-cast v6, Le1/p;

    .line 129
    .line 130
    if-nez v6, :cond_1

    .line 131
    .line 132
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sget-object v6, Lf1/l;->t:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v7, v3, Lf1/l;->e:Ln1/j;

    .line 139
    .line 140
    iget-object v7, v7, Ln1/j;->c:Ljava/lang/String;

    .line 141
    .line 142
    new-instance v8, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v7, " returned a null result. Treating it as a failure."

    .line 151
    .line 152
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    new-array v8, v4, [Ljava/lang/Throwable;

    .line 160
    .line 161
    invoke-virtual {v0, v6, v7, v8}, Le1/q;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :catchall_2
    move-exception v0

    .line 166
    goto :goto_6

    .line 167
    :catch_0
    move-exception v0

    .line 168
    goto :goto_3

    .line 169
    :catch_1
    move-exception v0

    .line 170
    goto :goto_3

    .line 171
    :catch_2
    move-exception v0

    .line 172
    goto :goto_4

    .line 173
    :cond_1
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    sget-object v8, Lf1/l;->t:Ljava/lang/String;

    .line 178
    .line 179
    const-string v9, "%s returned a %s result."

    .line 180
    .line 181
    iget-object v10, v3, Lf1/l;->e:Ln1/j;

    .line 182
    .line 183
    iget-object v10, v10, Ln1/j;->c:Ljava/lang/String;

    .line 184
    .line 185
    new-array v0, v0, [Ljava/lang/Object;

    .line 186
    .line 187
    aput-object v10, v0, v4

    .line 188
    .line 189
    aput-object v6, v0, v5

    .line 190
    .line 191
    invoke-static {v9, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    new-array v9, v4, [Ljava/lang/Throwable;

    .line 196
    .line 197
    invoke-virtual {v7, v8, v0, v9}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    iput-object v6, v3, Lf1/l;->h:Le1/p;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 201
    .line 202
    :goto_2
    invoke-virtual {v3}, Lf1/l;->b()V

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :goto_3
    :try_start_4
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    sget-object v7, Lf1/l;->t:Ljava/lang/String;

    .line 211
    .line 212
    new-instance v8, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string v2, " failed because it threw an exception/error"

    .line 221
    .line 222
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    new-array v5, v5, [Ljava/lang/Throwable;

    .line 230
    .line 231
    aput-object v0, v5, v4

    .line 232
    .line 233
    invoke-virtual {v6, v7, v2, v5}, Le1/q;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :goto_4
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    sget-object v7, Lf1/l;->t:Ljava/lang/String;

    .line 242
    .line 243
    new-instance v8, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v2, " was cancelled"

    .line 252
    .line 253
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    new-array v5, v5, [Ljava/lang/Throwable;

    .line 261
    .line 262
    aput-object v0, v5, v4

    .line 263
    .line 264
    invoke-virtual {v6, v7, v2, v5}, Le1/q;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 265
    .line 266
    .line 267
    goto :goto_2

    .line 268
    :goto_5
    return-void

    .line 269
    :goto_6
    invoke-virtual {v3}, Lf1/l;->b()V

    .line 270
    .line 271
    .line 272
    throw v0

    .line 273
    :pswitch_6
    iget-object v0, v1, LA4/j;->c:Ljava/lang/Object;

    .line 274
    .line 275
    move-object v2, v0

    .line 276
    check-cast v2, Lp1/j;

    .line 277
    .line 278
    iget-object v0, v1, LA4/j;->d:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, Lf1/l;

    .line 281
    .line 282
    const-string v3, "Starting work for "

    .line 283
    .line 284
    :try_start_5
    iget-object v5, v1, LA4/j;->b:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v5, Lp1/j;

    .line 287
    .line 288
    invoke-virtual {v5}, Lp1/h;->get()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    sget-object v6, Lf1/l;->t:Ljava/lang/String;

    .line 296
    .line 297
    iget-object v7, v0, Lf1/l;->e:Ln1/j;

    .line 298
    .line 299
    iget-object v7, v7, Ln1/j;->c:Ljava/lang/String;

    .line 300
    .line 301
    new-instance v8, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 314
    .line 315
    invoke-virtual {v5, v6, v3, v4}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    iget-object v3, v0, Lf1/l;->f:Landroidx/work/ListenableWorker;

    .line 319
    .line 320
    invoke-virtual {v3}, Landroidx/work/ListenableWorker;->startWork()LS5/p;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    iput-object v3, v0, Lf1/l;->r:LS5/p;

    .line 325
    .line 326
    invoke-virtual {v2, v3}, Lp1/j;->l(LS5/p;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 327
    .line 328
    .line 329
    goto :goto_7

    .line 330
    :catchall_3
    move-exception v0

    .line 331
    invoke-virtual {v2, v0}, Lp1/j;->k(Ljava/lang/Throwable;)Z

    .line 332
    .line 333
    .line 334
    :goto_7
    return-void

    .line 335
    :pswitch_7
    :try_start_6
    iget-object v0, v1, LA4/j;->d:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Lp1/j;

    .line 338
    .line 339
    invoke-virtual {v0}, Lp1/h;->get()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    check-cast v0, Ljava/lang/Boolean;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 346
    .line 347
    .line 348
    move-result v5
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_6 .. :try_end_6} :catch_3

    .line 349
    :catch_3
    iget-object v0, v1, LA4/j;->b:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v0, Lf1/b;

    .line 352
    .line 353
    iget-object v2, v1, LA4/j;->c:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v2, Ljava/lang/String;

    .line 356
    .line 357
    invoke-virtual {v0, v2, v5}, Lf1/b;->a(Ljava/lang/String;Z)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :pswitch_8
    iget-object v0, v1, LA4/j;->c:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Lb5/V;

    .line 364
    .line 365
    const-string v2, "AppMeasurementJobService processed last upload request."

    .line 366
    .line 367
    iget-object v0, v0, Lb5/V;->n:Lb5/T;

    .line 368
    .line 369
    invoke-virtual {v0, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    iget-object v0, v1, LA4/j;->b:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v0, Lb7/c;

    .line 375
    .line 376
    iget-object v0, v0, Lb7/c;->b:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v0, Landroid/app/Service;

    .line 379
    .line 380
    check-cast v0, Lb5/p1;

    .line 381
    .line 382
    iget-object v2, v1, LA4/j;->d:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v2, Landroid/app/job/JobParameters;

    .line 385
    .line 386
    invoke-interface {v0, v2}, Lb5/p1;->m(Landroid/app/job/JobParameters;)V

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    :pswitch_9
    const-string v2, "Failed to get app instance id"

    .line 391
    .line 392
    iget-object v0, v1, LA4/j;->c:Ljava/lang/Object;

    .line 393
    .line 394
    move-object v4, v0

    .line 395
    check-cast v4, Lcom/google/android/gms/internal/measurement/L;

    .line 396
    .line 397
    iget-object v0, v1, LA4/j;->d:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, Lb5/m1;

    .line 400
    .line 401
    iget-object v5, v0, LD/n;->a:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v5, Lb5/n0;

    .line 404
    .line 405
    :try_start_7
    iget-object v6, v5, Lb5/n0;->h:Lb5/e0;

    .line 406
    .line 407
    invoke-static {v6}, Lb5/n0;->d(LD/n;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v6}, Lb5/e0;->s0()Lb5/C0;

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    sget-object v7, Lb5/B0;->c:Lb5/B0;

    .line 415
    .line 416
    invoke-virtual {v6, v7}, Lb5/C0;->k(Lb5/B0;)Z

    .line 417
    .line 418
    .line 419
    move-result v6
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 420
    iget-object v7, v5, Lb5/n0;->h:Lb5/e0;

    .line 421
    .line 422
    iget-object v8, v5, Lb5/n0;->i:Lb5/V;

    .line 423
    .line 424
    if-nez v6, :cond_2

    .line 425
    .line 426
    :try_start_8
    invoke-static {v8}, Lb5/n0;->f(Lb5/x0;)V

    .line 427
    .line 428
    .line 429
    iget-object v0, v8, Lb5/V;->k:Lb5/T;

    .line 430
    .line 431
    const-string v6, "Analytics storage consent denied; will not get app instance id"

    .line 432
    .line 433
    invoke-virtual {v0, v6}, Lb5/T;->b(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    iget-object v0, v5, Lb5/n0;->p:Lb5/S0;

    .line 437
    .line 438
    invoke-static {v0}, Lb5/n0;->e(Lb5/B;)V

    .line 439
    .line 440
    .line 441
    iget-object v0, v0, Lb5/S0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 442
    .line 443
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    invoke-static {v7}, Lb5/n0;->d(LD/n;)V

    .line 447
    .line 448
    .line 449
    iget-object v0, v7, Lb5/e0;->h:LA6/t;

    .line 450
    .line 451
    invoke-virtual {v0, v3}, LA6/t;->n(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    goto :goto_8

    .line 455
    :catchall_4
    move-exception v0

    .line 456
    goto :goto_d

    .line 457
    :catch_4
    move-exception v0

    .line 458
    goto :goto_a

    .line 459
    :cond_2
    iget-object v6, v0, Lb5/m1;->d:Lb5/G;

    .line 460
    .line 461
    if-nez v6, :cond_3

    .line 462
    .line 463
    invoke-static {v8}, Lb5/n0;->f(Lb5/x0;)V

    .line 464
    .line 465
    .line 466
    iget-object v0, v8, Lb5/V;->f:Lb5/T;

    .line 467
    .line 468
    invoke-virtual {v0, v2}, Lb5/T;->b(Ljava/lang/String;)V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 469
    .line 470
    .line 471
    :goto_8
    iget-object v0, v5, Lb5/n0;->l:Lb5/P1;

    .line 472
    .line 473
    :goto_9
    invoke-static {v0}, Lb5/n0;->d(LD/n;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0, v3, v4}, Lb5/P1;->N0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/L;)V

    .line 477
    .line 478
    .line 479
    goto :goto_c

    .line 480
    :cond_3
    :try_start_9
    iget-object v8, v1, LA4/j;->b:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v8, Lb5/Q1;

    .line 483
    .line 484
    invoke-interface {v6, v8}, Lb5/G;->D0(Lb5/Q1;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    if-eqz v3, :cond_4

    .line 489
    .line 490
    iget-object v6, v5, Lb5/n0;->p:Lb5/S0;

    .line 491
    .line 492
    invoke-static {v6}, Lb5/n0;->e(Lb5/B;)V

    .line 493
    .line 494
    .line 495
    iget-object v6, v6, Lb5/S0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 496
    .line 497
    invoke-virtual {v6, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    invoke-static {v7}, Lb5/n0;->d(LD/n;)V

    .line 501
    .line 502
    .line 503
    iget-object v6, v7, Lb5/e0;->h:LA6/t;

    .line 504
    .line 505
    invoke-virtual {v6, v3}, LA6/t;->n(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    :cond_4
    invoke-virtual {v0}, Lb5/m1;->B0()V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 509
    .line 510
    .line 511
    goto :goto_b

    .line 512
    :goto_a
    :try_start_a
    iget-object v6, v5, Lb5/n0;->i:Lb5/V;

    .line 513
    .line 514
    invoke-static {v6}, Lb5/n0;->f(Lb5/x0;)V

    .line 515
    .line 516
    .line 517
    iget-object v6, v6, Lb5/V;->f:Lb5/T;

    .line 518
    .line 519
    invoke-virtual {v6, v0, v2}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 520
    .line 521
    .line 522
    :goto_b
    iget-object v0, v5, Lb5/n0;->l:Lb5/P1;

    .line 523
    .line 524
    goto :goto_9

    .line 525
    :goto_c
    return-void

    .line 526
    :goto_d
    iget-object v2, v5, Lb5/n0;->l:Lb5/P1;

    .line 527
    .line 528
    invoke-static {v2}, Lb5/n0;->d(LD/n;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2, v3, v4}, Lb5/P1;->N0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/L;)V

    .line 532
    .line 533
    .line 534
    throw v0

    .line 535
    :pswitch_a
    invoke-direct {v1}, LA4/j;->b()V

    .line 536
    .line 537
    .line 538
    return-void

    .line 539
    :pswitch_b
    iget-object v0, v1, LA4/j;->c:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v0, Lb5/Q1;

    .line 542
    .line 543
    iget-object v2, v1, LA4/j;->d:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v2, Lb5/d;

    .line 546
    .line 547
    iget-object v3, v1, LA4/j;->b:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v3, Lb5/m1;

    .line 550
    .line 551
    iget-object v4, v3, Lb5/m1;->d:Lb5/G;

    .line 552
    .line 553
    iget-object v5, v3, LD/n;->a:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v5, Lb5/n0;

    .line 556
    .line 557
    if-nez v4, :cond_5

    .line 558
    .line 559
    iget-object v0, v5, Lb5/n0;->i:Lb5/V;

    .line 560
    .line 561
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 562
    .line 563
    .line 564
    const-string v2, "[sgtm] Discarding data. Failed to update batch upload status."

    .line 565
    .line 566
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 567
    .line 568
    invoke-virtual {v0, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    goto :goto_e

    .line 572
    :cond_5
    :try_start_b
    invoke-interface {v4, v0, v2}, Lb5/G;->P0(Lb5/Q1;Lb5/d;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v3}, Lb5/m1;->B0()V
    :try_end_b
    .catch Landroid/os/RemoteException; {:try_start_b .. :try_end_b} :catch_5

    .line 576
    .line 577
    .line 578
    goto :goto_e

    .line 579
    :catch_5
    move-exception v0

    .line 580
    iget-object v3, v5, Lb5/n0;->i:Lb5/V;

    .line 581
    .line 582
    invoke-static {v3}, Lb5/n0;->f(Lb5/x0;)V

    .line 583
    .line 584
    .line 585
    iget-wide v4, v2, Lb5/d;->a:J

    .line 586
    .line 587
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    const-string v4, "[sgtm] Failed to update batch upload status, rowId, exception"

    .line 592
    .line 593
    iget-object v3, v3, Lb5/V;->f:Lb5/T;

    .line 594
    .line 595
    invoke-virtual {v3, v2, v0, v4}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    :goto_e
    return-void

    .line 599
    :pswitch_c
    iget-object v0, v1, LA4/j;->d:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v0, Lb5/w0;

    .line 602
    .line 603
    iget-object v2, v0, Lb5/w0;->e:Lb5/J1;

    .line 604
    .line 605
    invoke-virtual {v2}, Lb5/J1;->e()V

    .line 606
    .line 607
    .line 608
    iget-object v2, v1, LA4/j;->b:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast v2, Lb5/M1;

    .line 611
    .line 612
    invoke-virtual {v2}, Lb5/M1;->f()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    iget-object v4, v1, LA4/j;->c:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v4, Lb5/Q1;

    .line 619
    .line 620
    iget-object v0, v0, Lb5/w0;->e:Lb5/J1;

    .line 621
    .line 622
    if-nez v3, :cond_6

    .line 623
    .line 624
    iget-object v2, v2, Lb5/M1;->b:Ljava/lang/String;

    .line 625
    .line 626
    invoke-virtual {v0, v2, v4}, Lb5/J1;->P(Ljava/lang/String;Lb5/Q1;)V

    .line 627
    .line 628
    .line 629
    goto :goto_f

    .line 630
    :cond_6
    invoke-virtual {v0, v2, v4}, Lb5/J1;->W(Lb5/M1;Lb5/Q1;)V

    .line 631
    .line 632
    .line 633
    :goto_f
    return-void

    .line 634
    :pswitch_d
    iget-object v0, v1, LA4/j;->d:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v0, Lb5/w0;

    .line 637
    .line 638
    iget-object v2, v0, Lb5/w0;->e:Lb5/J1;

    .line 639
    .line 640
    invoke-virtual {v2}, Lb5/J1;->e()V

    .line 641
    .line 642
    .line 643
    iget-object v2, v1, LA4/j;->b:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v2, Lb5/t;

    .line 646
    .line 647
    iget-object v3, v1, LA4/j;->c:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v3, Ljava/lang/String;

    .line 650
    .line 651
    iget-object v0, v0, Lb5/w0;->e:Lb5/J1;

    .line 652
    .line 653
    invoke-virtual {v0, v2, v3}, Lb5/J1;->m(Lb5/t;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    return-void

    .line 657
    :pswitch_e
    iget-object v0, v1, LA4/j;->d:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast v0, Lb5/w0;

    .line 660
    .line 661
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    iget-object v2, v1, LA4/j;->b:Ljava/lang/Object;

    .line 665
    .line 666
    check-cast v2, Lb5/t;

    .line 667
    .line 668
    iget-object v6, v2, Lb5/t;->a:Ljava/lang/String;

    .line 669
    .line 670
    const-string v7, "_cmp"

    .line 671
    .line 672
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v6

    .line 676
    iget-object v7, v0, Lb5/w0;->e:Lb5/J1;

    .line 677
    .line 678
    if-eqz v6, :cond_9

    .line 679
    .line 680
    iget-object v10, v2, Lb5/t;->b:Lb5/s;

    .line 681
    .line 682
    if-eqz v10, :cond_9

    .line 683
    .line 684
    iget-object v6, v10, Lb5/s;->a:Landroid/os/Bundle;

    .line 685
    .line 686
    invoke-virtual {v6}, Landroid/os/BaseBundle;->size()I

    .line 687
    .line 688
    .line 689
    move-result v8

    .line 690
    if-nez v8, :cond_7

    .line 691
    .line 692
    goto :goto_10

    .line 693
    :cond_7
    const-string v8, "_cis"

    .line 694
    .line 695
    invoke-virtual {v6, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v6

    .line 699
    const-string v8, "referrer broadcast"

    .line 700
    .line 701
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result v8

    .line 705
    if-nez v8, :cond_8

    .line 706
    .line 707
    const-string v8, "referrer API"

    .line 708
    .line 709
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v6

    .line 713
    if-eqz v6, :cond_9

    .line 714
    .line 715
    :cond_8
    invoke-virtual {v7}, Lb5/J1;->A()Lb5/V;

    .line 716
    .line 717
    .line 718
    move-result-object v6

    .line 719
    invoke-virtual {v2}, Lb5/t;->toString()Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v8

    .line 723
    const-string v9, "Event has been filtered "

    .line 724
    .line 725
    iget-object v6, v6, Lb5/V;->l:Lb5/T;

    .line 726
    .line 727
    invoke-virtual {v6, v8, v9}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    new-instance v8, Lb5/t;

    .line 731
    .line 732
    iget-object v11, v2, Lb5/t;->c:Ljava/lang/String;

    .line 733
    .line 734
    iget-wide v12, v2, Lb5/t;->d:J

    .line 735
    .line 736
    const-string v9, "_cmpx"

    .line 737
    .line 738
    invoke-direct/range {v8 .. v13}, Lb5/t;-><init>(Ljava/lang/String;Lb5/s;Ljava/lang/String;J)V

    .line 739
    .line 740
    .line 741
    move-object v2, v8

    .line 742
    :cond_9
    :goto_10
    iget-object v6, v2, Lb5/t;->a:Ljava/lang/String;

    .line 743
    .line 744
    sget-object v8, Lb5/E;->o1:Lb5/D;

    .line 745
    .line 746
    invoke-virtual {v8, v3}, Lb5/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v8

    .line 750
    check-cast v8, Ljava/lang/Boolean;

    .line 751
    .line 752
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 753
    .line 754
    .line 755
    move-result v8

    .line 756
    iget-object v9, v1, LA4/j;->c:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast v9, Lb5/Q1;

    .line 759
    .line 760
    if-nez v8, :cond_d

    .line 761
    .line 762
    iget-object v8, v7, Lb5/J1;->a:Lb5/i0;

    .line 763
    .line 764
    invoke-static {v8}, Lb5/J1;->J(Lb5/D1;)V

    .line 765
    .line 766
    .line 767
    iget-object v10, v9, Lb5/Q1;->a:Ljava/lang/String;

    .line 768
    .line 769
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 770
    .line 771
    .line 772
    move-result v11

    .line 773
    if-eqz v11, :cond_a

    .line 774
    .line 775
    goto :goto_11

    .line 776
    :cond_a
    iget-object v8, v8, Lb5/i0;->h:Ls/e;

    .line 777
    .line 778
    invoke-virtual {v8, v10}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v8

    .line 782
    check-cast v8, Lcom/google/android/gms/internal/measurement/F0;

    .line 783
    .line 784
    if-nez v8, :cond_b

    .line 785
    .line 786
    goto :goto_11

    .line 787
    :cond_b
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/F0;->n()I

    .line 788
    .line 789
    .line 790
    move-result v8

    .line 791
    if-eqz v8, :cond_c

    .line 792
    .line 793
    invoke-virtual {v7}, Lb5/J1;->A()Lb5/V;

    .line 794
    .line 795
    .line 796
    move-result-object v8

    .line 797
    const-string v11, "EES config found for"

    .line 798
    .line 799
    iget-object v8, v8, Lb5/V;->n:Lb5/T;

    .line 800
    .line 801
    invoke-virtual {v8, v10, v11}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    goto :goto_12

    .line 805
    :cond_c
    :goto_11
    invoke-virtual {v0, v2, v9}, Lb5/w0;->h1(Lb5/t;Lb5/Q1;)V

    .line 806
    .line 807
    .line 808
    goto/16 :goto_18

    .line 809
    .line 810
    :cond_d
    :goto_12
    iget-object v8, v7, Lb5/J1;->a:Lb5/i0;

    .line 811
    .line 812
    iget-object v10, v7, Lb5/J1;->g:Lb5/Z;

    .line 813
    .line 814
    invoke-static {v8}, Lb5/J1;->J(Lb5/D1;)V

    .line 815
    .line 816
    .line 817
    iget-object v11, v9, Lb5/Q1;->a:Ljava/lang/String;

    .line 818
    .line 819
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 820
    .line 821
    .line 822
    move-result v12

    .line 823
    if-eqz v12, :cond_e

    .line 824
    .line 825
    goto :goto_13

    .line 826
    :cond_e
    iget-object v3, v8, Lb5/i0;->j:LA1/f;

    .line 827
    .line 828
    invoke-virtual {v3, v11}, LF0/z0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    check-cast v3, Lcom/google/android/gms/internal/measurement/D;

    .line 833
    .line 834
    :goto_13
    if-eqz v3, :cond_12

    .line 835
    .line 836
    :try_start_c
    iget-object v8, v3, Lcom/google/android/gms/internal/measurement/D;->c:Lb5/G1;

    .line 837
    .line 838
    invoke-static {v10}, Lb5/J1;->J(Lb5/D1;)V

    .line 839
    .line 840
    .line 841
    iget-object v11, v2, Lb5/t;->b:Lb5/s;

    .line 842
    .line 843
    invoke-virtual {v11}, Lb5/s;->f()Landroid/os/Bundle;

    .line 844
    .line 845
    .line 846
    move-result-object v11

    .line 847
    invoke-static {v11, v5}, Lb5/Z;->W0(Landroid/os/Bundle;Z)Ljava/util/HashMap;

    .line 848
    .line 849
    .line 850
    move-result-object v11

    .line 851
    sget-object v12, Lb5/D0;->c:[Ljava/lang/String;

    .line 852
    .line 853
    sget-object v13, Lb5/D0;->a:[Ljava/lang/String;

    .line 854
    .line 855
    invoke-static {v6, v12, v13}, Lb5/D0;->d(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v12

    .line 859
    if-eqz v12, :cond_f

    .line 860
    .line 861
    goto :goto_14

    .line 862
    :cond_f
    move-object v12, v6

    .line 863
    :goto_14
    new-instance v13, Lcom/google/android/gms/internal/measurement/b;

    .line 864
    .line 865
    iget-wide v14, v2, Lb5/t;->d:J

    .line 866
    .line 867
    invoke-direct {v13, v12, v14, v15, v11}, Lcom/google/android/gms/internal/measurement/b;-><init>(Ljava/lang/String;JLjava/util/HashMap;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v3, v13}, Lcom/google/android/gms/internal/measurement/D;->b(Lcom/google/android/gms/internal/measurement/b;)Z

    .line 871
    .line 872
    .line 873
    move-result v3
    :try_end_c
    .catch Lcom/google/android/gms/internal/measurement/N; {:try_start_c .. :try_end_c} :catch_6

    .line 874
    if-nez v3, :cond_10

    .line 875
    .line 876
    goto :goto_17

    .line 877
    :cond_10
    iget-object v3, v8, Lb5/G1;->c:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v3, Lcom/google/android/gms/internal/measurement/b;

    .line 880
    .line 881
    iget-object v11, v8, Lb5/G1;->b:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v11, Lcom/google/android/gms/internal/measurement/b;

    .line 884
    .line 885
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/measurement/b;->equals(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    move-result v3

    .line 889
    if-nez v3, :cond_11

    .line 890
    .line 891
    invoke-virtual {v7}, Lb5/J1;->A()Lb5/V;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    const-string v3, "EES edited event"

    .line 896
    .line 897
    iget-object v2, v2, Lb5/V;->n:Lb5/T;

    .line 898
    .line 899
    invoke-virtual {v2, v6, v3}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    invoke-static {v10}, Lb5/J1;->J(Lb5/D1;)V

    .line 903
    .line 904
    .line 905
    iget-object v2, v8, Lb5/G1;->c:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v2, Lcom/google/android/gms/internal/measurement/b;

    .line 908
    .line 909
    invoke-static {v2}, Lb5/Z;->O0(Lcom/google/android/gms/internal/measurement/b;)Lb5/t;

    .line 910
    .line 911
    .line 912
    move-result-object v2

    .line 913
    invoke-virtual {v0, v2, v9}, Lb5/w0;->h1(Lb5/t;Lb5/Q1;)V

    .line 914
    .line 915
    .line 916
    goto :goto_15

    .line 917
    :cond_11
    invoke-virtual {v0, v2, v9}, Lb5/w0;->h1(Lb5/t;Lb5/Q1;)V

    .line 918
    .line 919
    .line 920
    :goto_15
    iget-object v2, v8, Lb5/G1;->d:Ljava/lang/Object;

    .line 921
    .line 922
    check-cast v2, Ljava/util/ArrayList;

    .line 923
    .line 924
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 925
    .line 926
    .line 927
    move-result v2

    .line 928
    if-nez v2, :cond_13

    .line 929
    .line 930
    iget-object v2, v8, Lb5/G1;->d:Ljava/lang/Object;

    .line 931
    .line 932
    check-cast v2, Ljava/util/ArrayList;

    .line 933
    .line 934
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    :goto_16
    if-ge v4, v3, :cond_13

    .line 939
    .line 940
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v6

    .line 944
    add-int/2addr v4, v5

    .line 945
    check-cast v6, Lcom/google/android/gms/internal/measurement/b;

    .line 946
    .line 947
    invoke-virtual {v7}, Lb5/J1;->A()Lb5/V;

    .line 948
    .line 949
    .line 950
    move-result-object v8

    .line 951
    iget-object v11, v6, Lcom/google/android/gms/internal/measurement/b;->a:Ljava/lang/String;

    .line 952
    .line 953
    const-string v12, "EES logging created event"

    .line 954
    .line 955
    iget-object v8, v8, Lb5/V;->n:Lb5/T;

    .line 956
    .line 957
    invoke-virtual {v8, v11, v12}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 958
    .line 959
    .line 960
    invoke-static {v10}, Lb5/J1;->J(Lb5/D1;)V

    .line 961
    .line 962
    .line 963
    invoke-static {v6}, Lb5/Z;->O0(Lcom/google/android/gms/internal/measurement/b;)Lb5/t;

    .line 964
    .line 965
    .line 966
    move-result-object v6

    .line 967
    invoke-virtual {v0, v6, v9}, Lb5/w0;->h1(Lb5/t;Lb5/Q1;)V

    .line 968
    .line 969
    .line 970
    goto :goto_16

    .line 971
    :catch_6
    invoke-virtual {v7}, Lb5/J1;->A()Lb5/V;

    .line 972
    .line 973
    .line 974
    move-result-object v3

    .line 975
    iget-object v4, v9, Lb5/Q1;->b:Ljava/lang/String;

    .line 976
    .line 977
    const-string v5, "EES error. appId, eventName"

    .line 978
    .line 979
    iget-object v3, v3, Lb5/V;->f:Lb5/T;

    .line 980
    .line 981
    invoke-virtual {v3, v4, v6, v5}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    :goto_17
    invoke-virtual {v7}, Lb5/J1;->A()Lb5/V;

    .line 985
    .line 986
    .line 987
    move-result-object v3

    .line 988
    const-string v4, "EES was not applied to event"

    .line 989
    .line 990
    iget-object v3, v3, Lb5/V;->n:Lb5/T;

    .line 991
    .line 992
    invoke-virtual {v3, v6, v4}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v0, v2, v9}, Lb5/w0;->h1(Lb5/t;Lb5/Q1;)V

    .line 996
    .line 997
    .line 998
    goto :goto_18

    .line 999
    :cond_12
    invoke-virtual {v7}, Lb5/J1;->A()Lb5/V;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    iget-object v3, v3, Lb5/V;->n:Lb5/T;

    .line 1004
    .line 1005
    iget-object v4, v9, Lb5/Q1;->a:Ljava/lang/String;

    .line 1006
    .line 1007
    const-string v5, "EES not loaded for"

    .line 1008
    .line 1009
    invoke-virtual {v3, v4, v5}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v0, v2, v9}, Lb5/w0;->h1(Lb5/t;Lb5/Q1;)V

    .line 1013
    .line 1014
    .line 1015
    :cond_13
    :goto_18
    return-void

    .line 1016
    :pswitch_f
    iget-object v0, v1, LA4/j;->d:Ljava/lang/Object;

    .line 1017
    .line 1018
    check-cast v0, Lb5/w0;

    .line 1019
    .line 1020
    iget-object v2, v0, Lb5/w0;->e:Lb5/J1;

    .line 1021
    .line 1022
    invoke-virtual {v2}, Lb5/J1;->e()V

    .line 1023
    .line 1024
    .line 1025
    iget-object v2, v1, LA4/j;->b:Ljava/lang/Object;

    .line 1026
    .line 1027
    check-cast v2, Lb5/e;

    .line 1028
    .line 1029
    iget-object v3, v2, Lb5/e;->c:Lb5/M1;

    .line 1030
    .line 1031
    invoke-virtual {v3}, Lb5/M1;->f()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v3

    .line 1035
    iget-object v4, v1, LA4/j;->c:Ljava/lang/Object;

    .line 1036
    .line 1037
    check-cast v4, Lb5/Q1;

    .line 1038
    .line 1039
    iget-object v0, v0, Lb5/w0;->e:Lb5/J1;

    .line 1040
    .line 1041
    if-nez v3, :cond_14

    .line 1042
    .line 1043
    invoke-virtual {v0, v2, v4}, Lb5/J1;->O(Lb5/e;Lb5/Q1;)V

    .line 1044
    .line 1045
    .line 1046
    goto :goto_19

    .line 1047
    :cond_14
    invoke-virtual {v0, v2, v4}, Lb5/J1;->U(Lb5/e;Lb5/Q1;)V

    .line 1048
    .line 1049
    .line 1050
    :goto_19
    return-void

    .line 1051
    :pswitch_10
    iget-object v4, v1, LA4/j;->b:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v4, Lb5/w0;

    .line 1054
    .line 1055
    iget-object v4, v4, Lb5/w0;->e:Lb5/J1;

    .line 1056
    .line 1057
    invoke-virtual {v4}, Lb5/J1;->e()V

    .line 1058
    .line 1059
    .line 1060
    iget-object v6, v1, LA4/j;->c:Ljava/lang/Object;

    .line 1061
    .line 1062
    check-cast v6, Lb5/Q1;

    .line 1063
    .line 1064
    iget-object v6, v6, Lb5/Q1;->a:Ljava/lang/String;

    .line 1065
    .line 1066
    invoke-static {v6}, LF4/y;->h(Ljava/lang/Object;)V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v4}, Lb5/J1;->h0()Lb5/g;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v7

    .line 1073
    sget-object v8, Lb5/E;->Q0:Lb5/D;

    .line 1074
    .line 1075
    invoke-virtual {v7, v3, v8}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v7

    .line 1079
    if-nez v7, :cond_15

    .line 1080
    .line 1081
    goto/16 :goto_24

    .line 1082
    .line 1083
    :cond_15
    invoke-static {v4}, LA0/a;->v(Lb5/J1;)V

    .line 1084
    .line 1085
    .line 1086
    iget-object v9, v4, Lb5/J1;->c:Lb5/n;

    .line 1087
    .line 1088
    invoke-static {v9}, Lb5/J1;->J(Lb5/D1;)V

    .line 1089
    .line 1090
    .line 1091
    iget-object v7, v1, LA4/j;->d:Ljava/lang/Object;

    .line 1092
    .line 1093
    check-cast v7, Lb5/d;

    .line 1094
    .line 1095
    iget-wide v11, v7, Lb5/d;->a:J

    .line 1096
    .line 1097
    iget-object v10, v9, LD/n;->a:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v10, Lb5/n0;

    .line 1100
    .line 1101
    iget-object v13, v10, Lb5/n0;->g:Lb5/g;

    .line 1102
    .line 1103
    invoke-virtual {v13, v3, v8}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v13

    .line 1107
    const/4 v14, 0x4

    .line 1108
    if-nez v13, :cond_16

    .line 1109
    .line 1110
    move-object v0, v3

    .line 1111
    move/from16 v24, v14

    .line 1112
    .line 1113
    goto/16 :goto_20

    .line 1114
    .line 1115
    :cond_16
    invoke-virtual {v9}, LD/n;->l0()V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v9}, Lb5/D1;->m0()V

    .line 1119
    .line 1120
    .line 1121
    :try_start_d
    invoke-virtual {v9}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v15

    .line 1125
    const-string v16, "upload_queue"

    .line 1126
    .line 1127
    const-string v17, "rowId"

    .line 1128
    .line 1129
    const-string v18, "app_id"

    .line 1130
    .line 1131
    const-string v19, "measurement_batch"

    .line 1132
    .line 1133
    const-string v20, "upload_uri"

    .line 1134
    .line 1135
    const-string v21, "upload_headers"

    .line 1136
    .line 1137
    const-string v22, "upload_type"

    .line 1138
    .line 1139
    const-string v23, "retry_count"

    .line 1140
    .line 1141
    const-string v24, "creation_timestamp"

    .line 1142
    .line 1143
    const-string v25, "associated_row_id"

    .line 1144
    .line 1145
    const-string v26, "last_upload_timestamp"

    .line 1146
    .line 1147
    filled-new-array/range {v17 .. v26}, [Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v17

    .line 1151
    const-string v18, "rowId=?"

    .line 1152
    .line 1153
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v13

    .line 1157
    filled-new-array {v13}, [Ljava/lang/String;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v19

    .line 1161
    const-string v23, "1"

    .line 1162
    .line 1163
    const/16 v21, 0x0

    .line 1164
    .line 1165
    const/16 v22, 0x0

    .line 1166
    .line 1167
    const/16 v20, 0x0

    .line 1168
    .line 1169
    invoke-virtual/range {v15 .. v23}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v13
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_c
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 1173
    :try_start_e
    invoke-interface {v13}, Landroid/database/Cursor;->moveToFirst()Z

    .line 1174
    .line 1175
    .line 1176
    move-result v15
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_b
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 1177
    if-nez v15, :cond_17

    .line 1178
    .line 1179
    move/from16 v24, v14

    .line 1180
    .line 1181
    goto/16 :goto_1f

    .line 1182
    .line 1183
    :cond_17
    move-object v15, v10

    .line 1184
    :try_start_f
    invoke-interface {v13, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v10

    .line 1188
    invoke-static {v10}, LF4/y;->h(Ljava/lang/Object;)V

    .line 1189
    .line 1190
    .line 1191
    invoke-interface {v13, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    invoke-interface {v13, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v16
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_a
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 1199
    move-object/from16 v17, v15

    .line 1200
    .line 1201
    :try_start_10
    invoke-interface {v13, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v15
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_9
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 1205
    const/4 v14, 0x5

    .line 1206
    :try_start_11
    invoke-interface {v13, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 1207
    .line 1208
    .line 1209
    move-result v14

    .line 1210
    const/4 v2, 0x6

    .line 1211
    invoke-interface {v13, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 1212
    .line 1213
    .line 1214
    move-result v2

    .line 1215
    const/4 v3, 0x7

    .line 1216
    invoke-interface {v13, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 1217
    .line 1218
    .line 1219
    const/16 v3, 0x8

    .line 1220
    .line 1221
    invoke-interface {v13, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 1222
    .line 1223
    .line 1224
    move-result-wide v19

    .line 1225
    const/16 v3, 0x9

    .line 1226
    .line 1227
    invoke-interface {v13, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 1228
    .line 1229
    .line 1230
    move-result-wide v24
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 1231
    move-object/from16 v3, v16

    .line 1232
    .line 1233
    move/from16 v16, v14

    .line 1234
    .line 1235
    move-object v14, v3

    .line 1236
    move-object/from16 v3, v17

    .line 1237
    .line 1238
    move-wide/from16 v18, v19

    .line 1239
    .line 1240
    move-wide/from16 v20, v24

    .line 1241
    .line 1242
    const/16 v24, 0x4

    .line 1243
    .line 1244
    move/from16 v17, v2

    .line 1245
    .line 1246
    move-object v2, v13

    .line 1247
    move-object v13, v0

    .line 1248
    :try_start_12
    invoke-virtual/range {v9 .. v21}, Lb5/n;->O0(Ljava/lang/String;J[BLjava/lang/String;Ljava/lang/String;IIJJ)Lb5/K1;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v0
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_7
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    .line 1252
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 1253
    .line 1254
    .line 1255
    goto :goto_20

    .line 1256
    :catchall_5
    move-exception v0

    .line 1257
    goto :goto_1a

    .line 1258
    :catch_7
    move-exception v0

    .line 1259
    goto :goto_1b

    .line 1260
    :catchall_6
    move-exception v0

    .line 1261
    move-object v2, v13

    .line 1262
    goto :goto_1a

    .line 1263
    :catch_8
    move-exception v0

    .line 1264
    move-object v2, v13

    .line 1265
    move-object/from16 v3, v17

    .line 1266
    .line 1267
    const/16 v24, 0x4

    .line 1268
    .line 1269
    goto :goto_1b

    .line 1270
    :catch_9
    move-exception v0

    .line 1271
    move-object v2, v13

    .line 1272
    move/from16 v24, v14

    .line 1273
    .line 1274
    move-object/from16 v3, v17

    .line 1275
    .line 1276
    goto :goto_1b

    .line 1277
    :catch_a
    move-exception v0

    .line 1278
    move-object v2, v13

    .line 1279
    move/from16 v24, v14

    .line 1280
    .line 1281
    move-object v3, v15

    .line 1282
    goto :goto_1b

    .line 1283
    :goto_1a
    move-object v3, v2

    .line 1284
    goto/16 :goto_25

    .line 1285
    .line 1286
    :catch_b
    move-exception v0

    .line 1287
    move-object v3, v10

    .line 1288
    move-object v2, v13

    .line 1289
    move/from16 v24, v14

    .line 1290
    .line 1291
    :goto_1b
    move-object v13, v2

    .line 1292
    goto :goto_1e

    .line 1293
    :catchall_7
    move-exception v0

    .line 1294
    goto :goto_1c

    .line 1295
    :catch_c
    move-exception v0

    .line 1296
    move-object v3, v10

    .line 1297
    move/from16 v24, v14

    .line 1298
    .line 1299
    goto :goto_1d

    .line 1300
    :goto_1c
    const/4 v3, 0x0

    .line 1301
    goto/16 :goto_25

    .line 1302
    .line 1303
    :goto_1d
    const/4 v13, 0x0

    .line 1304
    :goto_1e
    :try_start_13
    iget-object v2, v3, Lb5/n0;->i:Lb5/V;

    .line 1305
    .line 1306
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 1307
    .line 1308
    .line 1309
    iget-object v2, v2, Lb5/V;->f:Lb5/T;

    .line 1310
    .line 1311
    const-string v3, "Error to querying MeasurementBatch from upload_queue. rowId"

    .line 1312
    .line 1313
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v9

    .line 1317
    invoke-virtual {v2, v9, v0, v3}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 1318
    .line 1319
    .line 1320
    :goto_1f
    if-eqz v13, :cond_18

    .line 1321
    .line 1322
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    .line 1323
    .line 1324
    .line 1325
    :cond_18
    const/4 v0, 0x0

    .line 1326
    :goto_20
    if-nez v0, :cond_19

    .line 1327
    .line 1328
    invoke-virtual {v4}, Lb5/J1;->A()Lb5/V;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v0

    .line 1332
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v2

    .line 1336
    const-string v3, "[sgtm] Queued batch doesn\'t exist. appId, rowId"

    .line 1337
    .line 1338
    iget-object v0, v0, Lb5/V;->i:Lb5/T;

    .line 1339
    .line 1340
    invoke-virtual {v0, v6, v2, v3}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1341
    .line 1342
    .line 1343
    goto/16 :goto_24

    .line 1344
    .line 1345
    :cond_19
    iget-object v2, v4, Lb5/J1;->X:Ljava/util/HashMap;

    .line 1346
    .line 1347
    iget-object v0, v0, Lb5/K1;->c:Ljava/lang/String;

    .line 1348
    .line 1349
    iget v3, v7, Lb5/d;->b:I

    .line 1350
    .line 1351
    if-ne v3, v5, :cond_1d

    .line 1352
    .line 1353
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1354
    .line 1355
    .line 1356
    move-result v3

    .line 1357
    if-eqz v3, :cond_1a

    .line 1358
    .line 1359
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1360
    .line 1361
    .line 1362
    :cond_1a
    iget-object v0, v4, Lb5/J1;->c:Lb5/n;

    .line 1363
    .line 1364
    invoke-static {v0}, Lb5/J1;->J(Lb5/D1;)V

    .line 1365
    .line 1366
    .line 1367
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v2

    .line 1371
    invoke-virtual {v0, v2}, Lb5/n;->z0(Ljava/lang/Long;)V

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v4}, Lb5/J1;->A()Lb5/V;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v0

    .line 1378
    const-string v3, "[sgtm] queued batch deleted after successful client upload. appId, rowId"

    .line 1379
    .line 1380
    iget-object v0, v0, Lb5/V;->n:Lb5/T;

    .line 1381
    .line 1382
    invoke-virtual {v0, v6, v2, v3}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1383
    .line 1384
    .line 1385
    iget-wide v2, v7, Lb5/d;->c:J

    .line 1386
    .line 1387
    const-wide/16 v9, 0x0

    .line 1388
    .line 1389
    cmp-long v0, v2, v9

    .line 1390
    .line 1391
    if-lez v0, :cond_20

    .line 1392
    .line 1393
    iget-object v0, v4, Lb5/J1;->c:Lb5/n;

    .line 1394
    .line 1395
    invoke-static {v0}, Lb5/J1;->J(Lb5/D1;)V

    .line 1396
    .line 1397
    .line 1398
    iget-object v7, v0, LD/n;->a:Ljava/lang/Object;

    .line 1399
    .line 1400
    check-cast v7, Lb5/n0;

    .line 1401
    .line 1402
    iget-object v9, v7, Lb5/n0;->g:Lb5/g;

    .line 1403
    .line 1404
    iget-object v10, v7, Lb5/n0;->i:Lb5/V;

    .line 1405
    .line 1406
    const/4 v11, 0x0

    .line 1407
    invoke-virtual {v9, v11, v8}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 1408
    .line 1409
    .line 1410
    move-result v8

    .line 1411
    if-nez v8, :cond_1b

    .line 1412
    .line 1413
    goto :goto_21

    .line 1414
    :cond_1b
    invoke-virtual {v0}, LD/n;->l0()V

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v0}, Lb5/D1;->m0()V

    .line 1418
    .line 1419
    .line 1420
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v8

    .line 1424
    new-instance v9, Landroid/content/ContentValues;

    .line 1425
    .line 1426
    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    .line 1427
    .line 1428
    .line 1429
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v5

    .line 1433
    const-string v11, "upload_type"

    .line 1434
    .line 1435
    invoke-virtual {v9, v11, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1436
    .line 1437
    .line 1438
    iget-object v5, v7, Lb5/n0;->n:LK4/a;

    .line 1439
    .line 1440
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1441
    .line 1442
    .line 1443
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1444
    .line 1445
    .line 1446
    move-result-wide v11

    .line 1447
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v5

    .line 1451
    const-string v7, "creation_timestamp"

    .line 1452
    .line 1453
    invoke-virtual {v9, v7, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1454
    .line 1455
    .line 1456
    :try_start_14
    invoke-virtual {v0}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0

    .line 1460
    const-string v5, "upload_queue"

    .line 1461
    .line 1462
    const-string v7, "rowid=? AND app_id=? AND upload_type=?"

    .line 1463
    .line 1464
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v11

    .line 1468
    invoke-static/range {v24 .. v24}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v12

    .line 1472
    filled-new-array {v11, v6, v12}, [Ljava/lang/String;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v11

    .line 1476
    invoke-virtual {v0, v5, v9, v7, v11}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1477
    .line 1478
    .line 1479
    move-result v0

    .line 1480
    int-to-long v11, v0

    .line 1481
    const-wide/16 v13, 0x1

    .line 1482
    .line 1483
    cmp-long v0, v11, v13

    .line 1484
    .line 1485
    if-eqz v0, :cond_1c

    .line 1486
    .line 1487
    invoke-static {v10}, Lb5/n0;->f(Lb5/x0;)V

    .line 1488
    .line 1489
    .line 1490
    iget-object v0, v10, Lb5/V;->i:Lb5/T;

    .line 1491
    .line 1492
    const-string v5, "Google Signal pending batch not updated. appId, rowId"

    .line 1493
    .line 1494
    invoke-virtual {v0, v6, v8, v5}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_d

    .line 1495
    .line 1496
    .line 1497
    goto :goto_21

    .line 1498
    :catch_d
    move-exception v0

    .line 1499
    goto :goto_22

    .line 1500
    :cond_1c
    :goto_21
    invoke-virtual {v4}, Lb5/J1;->A()Lb5/V;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v0

    .line 1504
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v2

    .line 1508
    const-string v3, "[sgtm] queued Google Signal batch updated. appId, signalRowId"

    .line 1509
    .line 1510
    iget-object v0, v0, Lb5/V;->n:Lb5/T;

    .line 1511
    .line 1512
    invoke-virtual {v0, v6, v2, v3}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v4, v6}, Lb5/J1;->Z(Ljava/lang/String;)V

    .line 1516
    .line 1517
    .line 1518
    goto :goto_24

    .line 1519
    :goto_22
    invoke-static {v10}, Lb5/n0;->f(Lb5/x0;)V

    .line 1520
    .line 1521
    .line 1522
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v2

    .line 1526
    const-string v3, "Failed to update google Signal pending batch. appid, rowId"

    .line 1527
    .line 1528
    iget-object v4, v10, Lb5/V;->f:Lb5/T;

    .line 1529
    .line 1530
    invoke-virtual {v4, v3, v6, v2, v0}, Lb5/T;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1531
    .line 1532
    .line 1533
    throw v0

    .line 1534
    :cond_1d
    const/4 v8, 0x3

    .line 1535
    if-ne v3, v8, :cond_1f

    .line 1536
    .line 1537
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v3

    .line 1541
    check-cast v3, Lb5/I1;

    .line 1542
    .line 1543
    if-nez v3, :cond_1e

    .line 1544
    .line 1545
    new-instance v3, Lb5/I1;

    .line 1546
    .line 1547
    invoke-direct {v3, v4}, Lb5/I1;-><init>(Lb5/J1;)V

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    goto :goto_23

    .line 1554
    :cond_1e
    iget v2, v3, Lb5/I1;->b:I

    .line 1555
    .line 1556
    add-int/2addr v2, v5

    .line 1557
    iput v2, v3, Lb5/I1;->b:I

    .line 1558
    .line 1559
    invoke-virtual {v3}, Lb5/I1;->a()J

    .line 1560
    .line 1561
    .line 1562
    move-result-wide v8

    .line 1563
    iput-wide v8, v3, Lb5/I1;->c:J

    .line 1564
    .line 1565
    :goto_23
    iget-wide v2, v3, Lb5/I1;->c:J

    .line 1566
    .line 1567
    invoke-virtual {v4}, Lb5/J1;->S()LK4/a;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v5

    .line 1571
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1572
    .line 1573
    .line 1574
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1575
    .line 1576
    .line 1577
    move-result-wide v8

    .line 1578
    sub-long/2addr v2, v8

    .line 1579
    invoke-virtual {v4}, Lb5/J1;->A()Lb5/V;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v5

    .line 1583
    const-wide/16 v8, 0x3e8

    .line 1584
    .line 1585
    div-long/2addr v2, v8

    .line 1586
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v2

    .line 1590
    const-string v3, "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds"

    .line 1591
    .line 1592
    iget-object v5, v5, Lb5/V;->n:Lb5/T;

    .line 1593
    .line 1594
    invoke-virtual {v5, v3, v6, v0, v2}, Lb5/T;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1595
    .line 1596
    .line 1597
    :cond_1f
    iget-object v0, v4, Lb5/J1;->c:Lb5/n;

    .line 1598
    .line 1599
    invoke-static {v0}, Lb5/J1;->J(Lb5/D1;)V

    .line 1600
    .line 1601
    .line 1602
    iget-wide v2, v7, Lb5/d;->a:J

    .line 1603
    .line 1604
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v2

    .line 1608
    invoke-virtual {v0, v2}, Lb5/n;->C0(Ljava/lang/Long;)V

    .line 1609
    .line 1610
    .line 1611
    invoke-virtual {v4}, Lb5/J1;->A()Lb5/V;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v0

    .line 1615
    const-string v3, "[sgtm] increased batch retry count after failed client upload. appId, rowId"

    .line 1616
    .line 1617
    iget-object v0, v0, Lb5/V;->n:Lb5/T;

    .line 1618
    .line 1619
    invoke-virtual {v0, v6, v2, v3}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1620
    .line 1621
    .line 1622
    :cond_20
    :goto_24
    return-void

    .line 1623
    :catchall_8
    move-exception v0

    .line 1624
    move-object v3, v13

    .line 1625
    :goto_25
    if-eqz v3, :cond_21

    .line 1626
    .line 1627
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 1628
    .line 1629
    .line 1630
    :cond_21
    throw v0

    .line 1631
    :pswitch_11
    iget-object v0, v1, LA4/j;->c:Ljava/lang/Object;

    .line 1632
    .line 1633
    check-cast v0, LO0/c;

    .line 1634
    .line 1635
    iget-object v2, v1, LA4/j;->b:Ljava/lang/Object;

    .line 1636
    .line 1637
    check-cast v2, Landroid/view/View;

    .line 1638
    .line 1639
    invoke-static {v2, v0}, LP/b0;->h(Landroid/view/View;LO0/c;)V

    .line 1640
    .line 1641
    .line 1642
    iget-object v0, v1, LA4/j;->d:Ljava/lang/Object;

    .line 1643
    .line 1644
    check-cast v0, Landroid/animation/ValueAnimator;

    .line 1645
    .line 1646
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 1647
    .line 1648
    .line 1649
    return-void

    .line 1650
    :pswitch_12
    :try_start_15
    iget-object v0, v1, LA4/j;->b:Ljava/lang/Object;

    .line 1651
    .line 1652
    check-cast v0, LM/e;

    .line 1653
    .line 1654
    invoke-virtual {v0}, LM/e;->call()Ljava/lang/Object;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v3
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_e

    .line 1658
    goto :goto_26

    .line 1659
    :catch_e
    const/4 v3, 0x0

    .line 1660
    :goto_26
    new-instance v0, LS5/o;

    .line 1661
    .line 1662
    iget-object v2, v1, LA4/j;->c:Ljava/lang/Object;

    .line 1663
    .line 1664
    check-cast v2, LM/f;

    .line 1665
    .line 1666
    const/16 v4, 0xc

    .line 1667
    .line 1668
    invoke-direct {v0, v2, v4, v3}, LS5/o;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1669
    .line 1670
    .line 1671
    iget-object v2, v1, LA4/j;->d:Ljava/lang/Object;

    .line 1672
    .line 1673
    check-cast v2, Landroid/os/Handler;

    .line 1674
    .line 1675
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1676
    .line 1677
    .line 1678
    return-void

    .line 1679
    :pswitch_13
    iget-object v0, v1, LA4/j;->d:Ljava/lang/Object;

    .line 1680
    .line 1681
    check-cast v0, LF6/c;

    .line 1682
    .line 1683
    iget-object v2, v1, LA4/j;->b:Ljava/lang/Object;

    .line 1684
    .line 1685
    check-cast v2, Ly6/b;

    .line 1686
    .line 1687
    iget-object v3, v1, LA4/j;->c:Ljava/lang/Object;

    .line 1688
    .line 1689
    check-cast v3, Lf5/i;

    .line 1690
    .line 1691
    invoke-virtual {v0, v2, v3}, LF6/c;->b(Ly6/b;Lf5/i;)V

    .line 1692
    .line 1693
    .line 1694
    iget-object v3, v0, LF6/c;->i:Lk4/E;

    .line 1695
    .line 1696
    iget-object v3, v3, Lk4/E;->c:Ljava/lang/Object;

    .line 1697
    .line 1698
    check-cast v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1699
    .line 1700
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1701
    .line 1702
    .line 1703
    iget-wide v6, v0, LF6/c;->a:D

    .line 1704
    .line 1705
    const-wide v8, 0x40ed4c0000000000L    # 60000.0

    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    div-double/2addr v8, v6

    .line 1711
    invoke-virtual {v0}, LF6/c;->a()I

    .line 1712
    .line 1713
    .line 1714
    move-result v3

    .line 1715
    int-to-double v6, v3

    .line 1716
    iget-wide v10, v0, LF6/c;->b:D

    .line 1717
    .line 1718
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 1719
    .line 1720
    .line 1721
    move-result-wide v6

    .line 1722
    mul-double/2addr v6, v8

    .line 1723
    const-wide v8, 0x414b774000000000L    # 3600000.0

    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->min(DD)D

    .line 1729
    .line 1730
    .line 1731
    move-result-wide v6

    .line 1732
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1733
    .line 1734
    const-string v3, "Delay for: "

    .line 1735
    .line 1736
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1737
    .line 1738
    .line 1739
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1740
    .line 1741
    const-wide v8, 0x408f400000000000L    # 1000.0

    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    div-double v8, v6, v8

    .line 1747
    .line 1748
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v8

    .line 1752
    new-array v5, v5, [Ljava/lang/Object;

    .line 1753
    .line 1754
    aput-object v8, v5, v4

    .line 1755
    .line 1756
    const-string v4, "%.2f"

    .line 1757
    .line 1758
    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v3

    .line 1762
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1763
    .line 1764
    .line 1765
    const-string v3, " s for report: "

    .line 1766
    .line 1767
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1768
    .line 1769
    .line 1770
    iget-object v2, v2, Ly6/b;->b:Ljava/lang/String;

    .line 1771
    .line 1772
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1773
    .line 1774
    .line 1775
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v0

    .line 1779
    const-string v2, "FirebaseCrashlytics"

    .line 1780
    .line 1781
    const/4 v8, 0x3

    .line 1782
    invoke-static {v2, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1783
    .line 1784
    .line 1785
    move-result v3

    .line 1786
    if-eqz v3, :cond_22

    .line 1787
    .line 1788
    const/4 v11, 0x0

    .line 1789
    invoke-static {v2, v0, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1790
    .line 1791
    .line 1792
    :cond_22
    double-to-long v2, v6

    .line 1793
    :try_start_16
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_16
    .catch Ljava/lang/InterruptedException; {:try_start_16 .. :try_end_16} :catch_f

    .line 1794
    .line 1795
    .line 1796
    :catch_f
    return-void

    .line 1797
    :pswitch_14
    invoke-direct {v1}, LA4/j;->a()V

    .line 1798
    .line 1799
    .line 1800
    return-void

    .line 1801
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
