.class public final LS5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb5/f0;Lcom/google/android/gms/internal/measurement/B;Lb5/f0;)V
    .locals 0

    const/16 p3, 0x10

    iput p3, p0, LS5/o;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LS5/o;->b:Ljava/lang/Object;

    iput-object p1, p0, LS5/o;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p2, p0, LS5/o;->a:I

    iput-object p1, p0, LS5/o;->b:Ljava/lang/Object;

    iput-object p3, p0, LS5/o;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 3
    iput p3, p0, LS5/o;->a:I

    iput-object p1, p0, LS5/o;->c:Ljava/lang/Object;

    iput-object p2, p0, LS5/o;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, LS5/o;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA4/n;

    .line 4
    .line 5
    iget-object v1, p0, LS5/o;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LA4/o;

    .line 8
    .line 9
    iget v1, v1, LA4/o;->a:I

    .line 10
    .line 11
    const-string v2, "Timing out request: "

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v3, v0, LA4/n;->e:Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, LA4/o;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    new-instance v4, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v4, "MessengerIpcClient"

    .line 37
    .line 38
    invoke-static {v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    iget-object v2, v0, LA4/n;->e:Landroid/util/SparseArray;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->remove(I)V

    .line 44
    .line 45
    .line 46
    const-string v1, "Timed out waiting for response"

    .line 47
    .line 48
    new-instance v2, LA4/p;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct {v2, v1, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, LA4/o;->b(LA4/p;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, LA4/n;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception v1

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    monitor-exit v0

    .line 65
    return-void

    .line 66
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw v1
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

.method private final b()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LS5/o;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, LD4/p;

    .line 5
    .line 6
    iget-boolean v1, v1, LD4/p;->b:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, LS5/o;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LD4/J;

    .line 15
    .line 16
    iget-object v1, v1, LD4/J;->b:LB4/b;

    .line 17
    .line 18
    iget v2, v1, LB4/b;->b:I

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, v1, LB4/b;->c:Landroid/app/PendingIntent;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    move v2, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v2, v0

    .line 30
    :goto_0
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iget-object v2, p0, LS5/o;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, LD4/p;

    .line 35
    .line 36
    iget-object v4, v2, LD4/p;->a:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v2}, LD4/p;->a()Landroid/app/Activity;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget-object v1, v1, LB4/b;->c:Landroid/app/PendingIntent;

    .line 43
    .line 44
    invoke-static {v1}, LF4/y;->h(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v5, p0, LS5/o;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v5, LD4/J;

    .line 50
    .line 51
    iget v5, v5, LD4/J;->a:I

    .line 52
    .line 53
    sget v6, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I

    .line 54
    .line 55
    new-instance v6, Landroid/content/Intent;

    .line 56
    .line 57
    const-class v7, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 58
    .line 59
    invoke-direct {v6, v2, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 60
    .line 61
    .line 62
    const-string v2, "pending_intent"

    .line 63
    .line 64
    invoke-virtual {v6, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    const-string v1, "failing_client_id"

    .line 68
    .line 69
    invoke-virtual {v6, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    const-string v1, "notify_manager"

    .line 73
    .line 74
    invoke-virtual {v6, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 75
    .line 76
    .line 77
    invoke-interface {v4, v6, v3}, LD4/h;->a(Landroid/content/Intent;I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    iget-object v2, p0, LS5/o;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, LD4/p;

    .line 84
    .line 85
    invoke-virtual {v2}, LD4/p;->a()Landroid/app/Activity;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iget v5, v1, LB4/b;->b:I

    .line 90
    .line 91
    iget-object v2, v2, LD4/p;->e:LB4/f;

    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    invoke-virtual {v2, v5, v4, v6}, LB4/g;->a(ILandroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_3

    .line 99
    .line 100
    iget-object v0, p0, LS5/o;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, LD4/p;

    .line 103
    .line 104
    invoke-virtual {v0}, LD4/p;->a()Landroid/app/Activity;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget-object v3, v0, LD4/p;->a:Ljava/lang/Object;

    .line 109
    .line 110
    iget v1, v1, LB4/b;->b:I

    .line 111
    .line 112
    iget-object v4, p0, LS5/o;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v4, LD4/p;

    .line 115
    .line 116
    iget-object v0, v0, LD4/p;->e:LB4/f;

    .line 117
    .line 118
    invoke-virtual {v0, v2, v3, v1, v4}, LB4/f;->g(Landroid/app/Activity;LD4/h;ILandroid/content/DialogInterface$OnCancelListener;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_3
    iget v2, v1, LB4/b;->b:I

    .line 123
    .line 124
    const/16 v4, 0x12

    .line 125
    .line 126
    if-ne v2, v4, :cond_9

    .line 127
    .line 128
    iget-object v1, p0, LS5/o;->c:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, LD4/p;

    .line 131
    .line 132
    iget-object v2, v1, LD4/p;->e:LB4/f;

    .line 133
    .line 134
    invoke-virtual {v1}, LD4/p;->a()Landroid/app/Activity;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance v2, Landroid/widget/ProgressBar;

    .line 142
    .line 143
    const v7, 0x101007a

    .line 144
    .line 145
    .line 146
    invoke-direct {v2, v5, v6, v7}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 153
    .line 154
    .line 155
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 156
    .line 157
    invoke-direct {v3, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 161
    .line 162
    .line 163
    invoke-static {v5, v4}, LF4/o;->b(Landroid/content/Context;I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 168
    .line 169
    .line 170
    const-string v2, ""

    .line 171
    .line 172
    invoke-virtual {v3, v2, v6}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    const-string v3, "GooglePlayServicesUpdatingDialog"

    .line 180
    .line 181
    invoke-static {v5, v2, v3, v1}, LB4/f;->e(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 182
    .line 183
    .line 184
    iget-object v1, p0, LS5/o;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, LD4/p;

    .line 187
    .line 188
    invoke-virtual {v1}, LD4/p;->a()Landroid/app/Activity;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    new-instance v4, LA1/g;

    .line 197
    .line 198
    const/16 v5, 0x9

    .line 199
    .line 200
    invoke-direct {v4, p0, v2, v5, v0}, LA1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 201
    .line 202
    .line 203
    iget-object v1, v1, LD4/p;->e:LB4/f;

    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    new-instance v1, Landroid/content/IntentFilter;

    .line 209
    .line 210
    const-string v5, "android.intent.action.PACKAGE_ADDED"

    .line 211
    .line 212
    invoke-direct {v1, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const-string v5, "package"

    .line 216
    .line 217
    invoke-virtual {v1, v5}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    new-instance v5, LD4/x;

    .line 221
    .line 222
    invoke-direct {v5, v4}, LD4/x;-><init>(LA1/g;)V

    .line 223
    .line 224
    .line 225
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 226
    .line 227
    const/16 v7, 0x21

    .line 228
    .line 229
    if-lt v4, v7, :cond_5

    .line 230
    .line 231
    if-lt v4, v7, :cond_4

    .line 232
    .line 233
    const/4 v0, 0x2

    .line 234
    :cond_4
    invoke-static {v3, v5, v1, v0}, LB4/e;->h(Landroid/content/Context;LD4/x;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_5
    invoke-virtual {v3, v5, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 239
    .line 240
    .line 241
    :goto_1
    iput-object v3, v5, LD4/x;->b:Landroid/content/Context;

    .line 242
    .line 243
    invoke-static {v3}, LB4/h;->b(Landroid/content/Context;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-nez v0, :cond_8

    .line 248
    .line 249
    iget-object v0, p0, LS5/o;->c:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, LD4/p;

    .line 252
    .line 253
    iget-object v1, v0, LD4/p;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 254
    .line 255
    invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    iget-object v0, v0, LD4/p;->g:LD4/g;

    .line 259
    .line 260
    iget-object v0, v0, LD4/g;->n:LT4/d;

    .line 261
    .line 262
    const/4 v1, 0x3

    .line 263
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Landroid/app/Dialog;->isShowing()Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_6

    .line 275
    .line 276
    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    .line 277
    .line 278
    .line 279
    :cond_6
    monitor-enter v5

    .line 280
    :try_start_0
    iget-object v0, v5, LD4/x;->b:Landroid/content/Context;

    .line 281
    .line 282
    if-eqz v0, :cond_7

    .line 283
    .line 284
    invoke-virtual {v0, v5}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 285
    .line 286
    .line 287
    goto :goto_2

    .line 288
    :catchall_0
    move-exception v0

    .line 289
    goto :goto_3

    .line 290
    :cond_7
    :goto_2
    iput-object v6, v5, LD4/x;->b:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 291
    .line 292
    monitor-exit v5

    .line 293
    return-void

    .line 294
    :goto_3
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 295
    throw v0

    .line 296
    :cond_8
    :goto_4
    return-void

    .line 297
    :cond_9
    iget-object v0, p0, LS5/o;->c:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, LD4/p;

    .line 300
    .line 301
    iget-object v2, p0, LS5/o;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v2, LD4/J;

    .line 304
    .line 305
    iget v2, v2, LD4/J;->a:I

    .line 306
    .line 307
    iget-object v3, v0, LD4/p;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 308
    .line 309
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    iget-object v0, v0, LD4/p;->g:LD4/g;

    .line 313
    .line 314
    invoke-virtual {v0, v1, v2}, LD4/g;->h(LB4/b;I)V

    .line 315
    .line 316
    .line 317
    return-void
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
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v0

    .line 6
    check-cast v3, Lb5/n0;

    .line 7
    .line 8
    iget-object v0, v3, Lb5/n0;->j:Lb5/m0;

    .line 9
    .line 10
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lb5/m0;->l0()V

    .line 14
    .line 15
    .line 16
    iget-object v8, v3, Lb5/n0;->g:Lb5/g;

    .line 17
    .line 18
    iget-object v0, v8, LD/n;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lb5/n0;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lb5/q;

    .line 26
    .line 27
    invoke-direct {v0, v3}, Lb5/x0;-><init>(Lb5/n0;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lb5/x0;->o0()V

    .line 31
    .line 32
    .line 33
    iput-object v0, v3, Lb5/n0;->v:Lb5/q;

    .line 34
    .line 35
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v9, v0

    .line 38
    check-cast v9, Lb5/F0;

    .line 39
    .line 40
    iget-object v0, v9, Lb5/F0;->g:Lcom/google/android/gms/internal/measurement/U;

    .line 41
    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    const-wide/16 v6, 0x0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-wide v4, v0, Lcom/google/android/gms/internal/measurement/U;->a:J

    .line 48
    .line 49
    move-wide v6, v4

    .line 50
    :goto_0
    new-instance v2, Lb5/L;

    .line 51
    .line 52
    iget-wide v4, v9, Lb5/F0;->f:J

    .line 53
    .line 54
    invoke-direct/range {v2 .. v7}, Lb5/L;-><init>(Lb5/n0;JJ)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lb5/B;->n0()V

    .line 58
    .line 59
    .line 60
    iput-object v2, v3, Lb5/n0;->w:Lb5/L;

    .line 61
    .line 62
    new-instance v0, Lb5/N;

    .line 63
    .line 64
    invoke-direct {v0, v3}, Lb5/N;-><init>(Lb5/n0;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lb5/B;->n0()V

    .line 68
    .line 69
    .line 70
    iput-object v0, v3, Lb5/n0;->t:Lb5/N;

    .line 71
    .line 72
    new-instance v0, Lb5/m1;

    .line 73
    .line 74
    invoke-direct {v0, v3}, Lb5/m1;-><init>(Lb5/n0;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lb5/B;->n0()V

    .line 78
    .line 79
    .line 80
    iput-object v0, v3, Lb5/n0;->u:Lb5/m1;

    .line 81
    .line 82
    iget-object v4, v3, Lb5/n0;->l:Lb5/P1;

    .line 83
    .line 84
    iget-boolean v0, v4, Lb5/x0;->b:Z

    .line 85
    .line 86
    const-string v5, "Can\'t initialize twice"

    .line 87
    .line 88
    if-nez v0, :cond_5b

    .line 89
    .line 90
    invoke-virtual {v4}, LD/n;->l0()V

    .line 91
    .line 92
    .line 93
    new-instance v0, Ljava/security/SecureRandom;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 99
    .line 100
    .line 101
    move-result-wide v6

    .line 102
    const-wide/16 v12, 0x0

    .line 103
    .line 104
    cmp-long v14, v6, v12

    .line 105
    .line 106
    if-nez v14, :cond_1

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 109
    .line 110
    .line 111
    move-result-wide v6

    .line 112
    cmp-long v0, v6, v12

    .line 113
    .line 114
    if-nez v0, :cond_1

    .line 115
    .line 116
    iget-object v0, v4, LD/n;->a:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Lb5/n0;

    .line 119
    .line 120
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 121
    .line 122
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 123
    .line 124
    .line 125
    const-string v12, "Utils falling back to Random for random id"

    .line 126
    .line 127
    iget-object v0, v0, Lb5/V;->i:Lb5/T;

    .line 128
    .line 129
    invoke-virtual {v0, v12}, Lb5/T;->b(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_1
    iget-object v0, v4, Lb5/P1;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 133
    .line 134
    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 135
    .line 136
    .line 137
    iget-object v0, v4, LD/n;->a:Ljava/lang/Object;

    .line 138
    .line 139
    move-object v6, v0

    .line 140
    check-cast v6, Lb5/n0;

    .line 141
    .line 142
    iget-object v0, v6, Lb5/n0;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 145
    .line 146
    .line 147
    const/4 v7, 0x1

    .line 148
    iput-boolean v7, v4, Lb5/x0;->b:Z

    .line 149
    .line 150
    iget-object v12, v3, Lb5/n0;->h:Lb5/e0;

    .line 151
    .line 152
    iget-boolean v0, v12, Lb5/x0;->b:Z

    .line 153
    .line 154
    if-nez v0, :cond_5a

    .line 155
    .line 156
    iget-object v0, v12, LD/n;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lb5/n0;

    .line 159
    .line 160
    iget-object v0, v0, Lb5/n0;->a:Landroid/content/Context;

    .line 161
    .line 162
    const-string v13, "com.google.android.gms.measurement.prefs"

    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    invoke-virtual {v0, v13, v14}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iput-object v0, v12, Lb5/e0;->c:Landroid/content/SharedPreferences;

    .line 170
    .line 171
    const-string v13, "has_been_opened"

    .line 172
    .line 173
    invoke-interface {v0, v13, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    iput-boolean v0, v12, Lb5/e0;->s:Z

    .line 178
    .line 179
    if-nez v0, :cond_2

    .line 180
    .line 181
    iget-object v0, v12, Lb5/e0;->c:Landroid/content/SharedPreferences;

    .line 182
    .line 183
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    const/4 v14, 0x1

    .line 188
    invoke-interface {v0, v13, v14}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 189
    .line 190
    .line 191
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 192
    .line 193
    .line 194
    :cond_2
    new-instance v0, Lb5/d0;

    .line 195
    .line 196
    sget-object v13, Lb5/E;->d:Lb5/D;

    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    invoke-virtual {v13, v14}, Lb5/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    check-cast v13, Ljava/lang/Long;

    .line 204
    .line 205
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 206
    .line 207
    .line 208
    move-result-wide v13

    .line 209
    const-wide/16 v15, 0x0

    .line 210
    .line 211
    const-wide/16 v10, 0x0

    .line 212
    .line 213
    invoke-static {v10, v11, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 214
    .line 215
    .line 216
    move-result-wide v10

    .line 217
    invoke-direct {v0, v12, v10, v11}, Lb5/d0;-><init>(Lb5/e0;J)V

    .line 218
    .line 219
    .line 220
    iput-object v0, v12, Lb5/e0;->f:Lb5/d0;

    .line 221
    .line 222
    iget-object v0, v12, LD/n;->a:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Lb5/n0;

    .line 225
    .line 226
    iget-object v0, v0, Lb5/n0;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 229
    .line 230
    .line 231
    iput-boolean v7, v12, Lb5/x0;->b:Z

    .line 232
    .line 233
    iget-object v10, v3, Lb5/n0;->w:Lb5/L;

    .line 234
    .line 235
    iget-boolean v0, v10, Lb5/B;->b:Z

    .line 236
    .line 237
    if-nez v0, :cond_59

    .line 238
    .line 239
    iget-object v0, v10, LD/n;->a:Ljava/lang/Object;

    .line 240
    .line 241
    move-object v11, v0

    .line 242
    check-cast v11, Lb5/n0;

    .line 243
    .line 244
    iget-object v0, v11, Lb5/n0;->i:Lb5/V;

    .line 245
    .line 246
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 247
    .line 248
    .line 249
    iget-wide v13, v10, Lb5/L;->j:J

    .line 250
    .line 251
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    move-object v14, v8

    .line 256
    iget-wide v7, v10, Lb5/L;->i:J

    .line 257
    .line 258
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    iget-object v0, v0, Lb5/V;->n:Lb5/T;

    .line 263
    .line 264
    const-string v8, "sdkVersion bundled with app, dynamiteVersion"

    .line 265
    .line 266
    invoke-virtual {v0, v13, v7, v8}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    iget-object v7, v11, Lb5/n0;->a:Landroid/content/Context;

    .line 270
    .line 271
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    move-wide/from16 v17, v15

    .line 280
    .line 281
    iget-object v15, v11, Lb5/n0;->i:Lb5/V;

    .line 282
    .line 283
    const-string v0, "Unknown"

    .line 284
    .line 285
    const/high16 v16, -0x80000000

    .line 286
    .line 287
    move-object/from16 v19, v0

    .line 288
    .line 289
    const-string v0, ""

    .line 290
    .line 291
    const-string v20, "unknown"

    .line 292
    .line 293
    if-nez v13, :cond_4

    .line 294
    .line 295
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 296
    .line 297
    .line 298
    invoke-static {v8}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    move-object/from16 v22, v2

    .line 303
    .line 304
    const-string v2, "PackageManager is null, app identity information might be inaccurate. appId"

    .line 305
    .line 306
    move-object/from16 v23, v14

    .line 307
    .line 308
    iget-object v14, v15, Lb5/V;->f:Lb5/T;

    .line 309
    .line 310
    invoke-virtual {v14, v1, v2}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    :cond_3
    move-object/from16 v24, v13

    .line 314
    .line 315
    move/from16 v1, v16

    .line 316
    .line 317
    move-object/from16 v2, v19

    .line 318
    .line 319
    move-object v14, v2

    .line 320
    :goto_1
    move-object/from16 v13, v20

    .line 321
    .line 322
    goto/16 :goto_7

    .line 323
    .line 324
    :cond_4
    move-object/from16 v22, v2

    .line 325
    .line 326
    move-object/from16 v23, v14

    .line 327
    .line 328
    :try_start_0
    invoke-virtual {v13, v8}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v20
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 332
    :goto_2
    move-object/from16 v1, v20

    .line 333
    .line 334
    goto :goto_3

    .line 335
    :catch_0
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 336
    .line 337
    .line 338
    invoke-static {v8}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    const-string v2, "Error retrieving app installer package name. appId"

    .line 343
    .line 344
    iget-object v14, v15, Lb5/V;->f:Lb5/T;

    .line 345
    .line 346
    invoke-virtual {v14, v1, v2}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    goto :goto_2

    .line 350
    :goto_3
    if-nez v1, :cond_6

    .line 351
    .line 352
    const-string v1, "manual_install"

    .line 353
    .line 354
    :cond_5
    move-object/from16 v20, v1

    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_6
    const-string v2, "com.android.vending"

    .line 358
    .line 359
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-eqz v2, :cond_5

    .line 364
    .line 365
    move-object/from16 v20, v0

    .line 366
    .line 367
    :goto_4
    :try_start_1
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    const/4 v2, 0x0

    .line 372
    invoke-virtual {v13, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    if-eqz v1, :cond_3

    .line 377
    .line 378
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 379
    .line 380
    invoke-virtual {v13, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 385
    .line 386
    .line 387
    move-result v14

    .line 388
    if-nez v14, :cond_7

    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    .line 394
    goto :goto_5

    .line 395
    :cond_7
    move-object/from16 v2, v19

    .line 396
    .line 397
    :goto_5
    :try_start_2
    iget-object v14, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_3

    .line 398
    .line 399
    :try_start_3
    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    .line 400
    .line 401
    move-object/from16 v24, v13

    .line 402
    .line 403
    goto :goto_1

    .line 404
    :catch_1
    move-object/from16 v19, v14

    .line 405
    .line 406
    goto :goto_6

    .line 407
    :catch_2
    move-object/from16 v2, v19

    .line 408
    .line 409
    :catch_3
    :goto_6
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 410
    .line 411
    .line 412
    invoke-static {v8}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    const-string v14, "Error retrieving package info. appId, appName"

    .line 417
    .line 418
    move-object/from16 v24, v13

    .line 419
    .line 420
    iget-object v13, v15, Lb5/V;->f:Lb5/T;

    .line 421
    .line 422
    invoke-virtual {v13, v1, v2, v14}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    move/from16 v1, v16

    .line 426
    .line 427
    move-object/from16 v14, v19

    .line 428
    .line 429
    goto :goto_1

    .line 430
    :goto_7
    iput-object v8, v10, Lb5/L;->c:Ljava/lang/String;

    .line 431
    .line 432
    iput-object v13, v10, Lb5/L;->f:Ljava/lang/String;

    .line 433
    .line 434
    iput-object v14, v10, Lb5/L;->d:Ljava/lang/String;

    .line 435
    .line 436
    iput v1, v10, Lb5/L;->e:I

    .line 437
    .line 438
    iput-object v2, v10, Lb5/L;->g:Ljava/lang/String;

    .line 439
    .line 440
    const-wide/16 v1, 0x0

    .line 441
    .line 442
    iput-wide v1, v10, Lb5/L;->h:J

    .line 443
    .line 444
    sget-object v1, Lb5/E;->q1:Lb5/D;

    .line 445
    .line 446
    iget-object v2, v11, Lb5/n0;->g:Lb5/g;

    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    invoke-virtual {v2, v13, v1}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 450
    .line 451
    .line 452
    move-result v14

    .line 453
    if-nez v14, :cond_9

    .line 454
    .line 455
    invoke-virtual {v11}, Lb5/n0;->n()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v14

    .line 459
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 460
    .line 461
    .line 462
    move-result v14

    .line 463
    if-nez v14, :cond_9

    .line 464
    .line 465
    const/4 v14, 0x0

    .line 466
    invoke-virtual {v2, v14, v1}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 467
    .line 468
    .line 469
    move-result v19

    .line 470
    if-eqz v19, :cond_8

    .line 471
    .line 472
    const/4 v14, 0x0

    .line 473
    goto :goto_8

    .line 474
    :cond_8
    iget-object v14, v11, Lb5/n0;->c:Ljava/lang/String;

    .line 475
    .line 476
    :goto_8
    const-string v13, "am"

    .line 477
    .line 478
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v13

    .line 482
    if-eqz v13, :cond_9

    .line 483
    .line 484
    const/4 v13, 0x1

    .line 485
    goto :goto_9

    .line 486
    :cond_9
    const/4 v13, 0x0

    .line 487
    :goto_9
    invoke-virtual {v11}, Lb5/n0;->g()I

    .line 488
    .line 489
    .line 490
    move-result v14

    .line 491
    move-object/from16 v20, v8

    .line 492
    .line 493
    iget-object v8, v11, Lb5/n0;->s:Ljava/lang/String;

    .line 494
    .line 495
    if-eqz v14, :cond_10

    .line 496
    .line 497
    move/from16 v25, v13

    .line 498
    .line 499
    const/4 v13, 0x1

    .line 500
    if-eq v14, v13, :cond_f

    .line 501
    .line 502
    const/4 v13, 0x3

    .line 503
    if-eq v14, v13, :cond_e

    .line 504
    .line 505
    const/4 v13, 0x4

    .line 506
    if-eq v14, v13, :cond_d

    .line 507
    .line 508
    const/4 v13, 0x6

    .line 509
    if-eq v14, v13, :cond_c

    .line 510
    .line 511
    const/4 v13, 0x7

    .line 512
    if-eq v14, v13, :cond_b

    .line 513
    .line 514
    const/16 v13, 0x8

    .line 515
    .line 516
    if-eq v14, v13, :cond_a

    .line 517
    .line 518
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 519
    .line 520
    .line 521
    const-string v13, "App measurement disabled"

    .line 522
    .line 523
    move/from16 v19, v14

    .line 524
    .line 525
    iget-object v14, v15, Lb5/V;->l:Lb5/T;

    .line 526
    .line 527
    invoke-virtual {v14, v13}, Lb5/T;->b(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 531
    .line 532
    .line 533
    const-string v13, "Invalid scion state in identity"

    .line 534
    .line 535
    iget-object v14, v15, Lb5/V;->g:Lb5/T;

    .line 536
    .line 537
    invoke-virtual {v14, v13}, Lb5/T;->b(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    goto :goto_a

    .line 541
    :cond_a
    move/from16 v19, v14

    .line 542
    .line 543
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 544
    .line 545
    .line 546
    const-string v13, "App measurement disabled due to denied storage consent"

    .line 547
    .line 548
    iget-object v14, v15, Lb5/V;->l:Lb5/T;

    .line 549
    .line 550
    invoke-virtual {v14, v13}, Lb5/T;->b(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    goto :goto_a

    .line 554
    :cond_b
    move/from16 v19, v14

    .line 555
    .line 556
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 557
    .line 558
    .line 559
    const-string v13, "App measurement disabled via the global data collection setting"

    .line 560
    .line 561
    iget-object v14, v15, Lb5/V;->l:Lb5/T;

    .line 562
    .line 563
    invoke-virtual {v14, v13}, Lb5/T;->b(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    goto :goto_a

    .line 567
    :cond_c
    move/from16 v19, v14

    .line 568
    .line 569
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 570
    .line 571
    .line 572
    const-string v13, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    .line 573
    .line 574
    iget-object v14, v15, Lb5/V;->k:Lb5/T;

    .line 575
    .line 576
    invoke-virtual {v14, v13}, Lb5/T;->b(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    goto :goto_a

    .line 580
    :cond_d
    move/from16 v19, v14

    .line 581
    .line 582
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 583
    .line 584
    .line 585
    const-string v13, "App measurement disabled via the manifest"

    .line 586
    .line 587
    iget-object v14, v15, Lb5/V;->l:Lb5/T;

    .line 588
    .line 589
    invoke-virtual {v14, v13}, Lb5/T;->b(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    goto :goto_a

    .line 593
    :cond_e
    move/from16 v19, v14

    .line 594
    .line 595
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 596
    .line 597
    .line 598
    const-string v13, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    .line 599
    .line 600
    iget-object v14, v15, Lb5/V;->l:Lb5/T;

    .line 601
    .line 602
    invoke-virtual {v14, v13}, Lb5/T;->b(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    goto :goto_a

    .line 606
    :cond_f
    move/from16 v19, v14

    .line 607
    .line 608
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 609
    .line 610
    .line 611
    const-string v13, "App measurement deactivated via the manifest"

    .line 612
    .line 613
    iget-object v14, v15, Lb5/V;->l:Lb5/T;

    .line 614
    .line 615
    invoke-virtual {v14, v13}, Lb5/T;->b(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    goto :goto_a

    .line 619
    :cond_10
    move/from16 v25, v13

    .line 620
    .line 621
    move/from16 v19, v14

    .line 622
    .line 623
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 624
    .line 625
    .line 626
    const-string v13, "App measurement collection enabled"

    .line 627
    .line 628
    iget-object v14, v15, Lb5/V;->n:Lb5/T;

    .line 629
    .line 630
    invoke-virtual {v14, v13}, Lb5/T;->b(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    :goto_a
    iput-object v0, v10, Lb5/L;->n:Ljava/lang/String;

    .line 634
    .line 635
    iput-object v0, v10, Lb5/L;->o:Ljava/lang/String;

    .line 636
    .line 637
    if-eqz v25, :cond_11

    .line 638
    .line 639
    invoke-virtual {v11}, Lb5/n0;->n()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v13

    .line 643
    iput-object v13, v10, Lb5/L;->o:Ljava/lang/String;

    .line 644
    .line 645
    :cond_11
    :try_start_4
    invoke-static {v7, v8}, Lb5/D0;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v13

    .line 649
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 650
    .line 651
    .line 652
    move-result v14

    .line 653
    if-eqz v14, :cond_12

    .line 654
    .line 655
    goto :goto_b

    .line 656
    :cond_12
    move-object v0, v13

    .line 657
    :goto_b
    iput-object v0, v10, Lb5/L;->n:Ljava/lang/String;

    .line 658
    .line 659
    const/4 v14, 0x0

    .line 660
    invoke-virtual {v2, v14, v1}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 661
    .line 662
    .line 663
    move-result v0

    .line 664
    if-nez v0, :cond_15

    .line 665
    .line 666
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 667
    .line 668
    .line 669
    move-result v0

    .line 670
    if-nez v0, :cond_15

    .line 671
    .line 672
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 677
    .line 678
    .line 679
    move-result v1

    .line 680
    if-nez v1, :cond_13

    .line 681
    .line 682
    goto :goto_c

    .line 683
    :cond_13
    invoke-static {v7}, Lb5/D0;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v8

    .line 687
    :goto_c
    const-string v1, "admob_app_id"

    .line 688
    .line 689
    const-string v13, "string"

    .line 690
    .line 691
    invoke-virtual {v0, v1, v13, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 692
    .line 693
    .line 694
    move-result v1
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_5

    .line 695
    if-nez v1, :cond_14

    .line 696
    .line 697
    goto :goto_d

    .line 698
    :cond_14
    :try_start_5
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v14
    :try_end_5
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_5

    .line 702
    goto :goto_e

    .line 703
    :catch_4
    :goto_d
    const/4 v14, 0x0

    .line 704
    :goto_e
    :try_start_6
    iput-object v14, v10, Lb5/L;->o:Ljava/lang/String;

    .line 705
    .line 706
    goto :goto_f

    .line 707
    :catch_5
    move-exception v0

    .line 708
    goto :goto_12

    .line 709
    :cond_15
    :goto_f
    if-nez v19, :cond_17

    .line 710
    .line 711
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 712
    .line 713
    .line 714
    iget-object v0, v15, Lb5/V;->n:Lb5/T;

    .line 715
    .line 716
    const-string v1, "App measurement enabled for app package, google app id"

    .line 717
    .line 718
    iget-object v8, v10, Lb5/L;->c:Ljava/lang/String;

    .line 719
    .line 720
    iget-object v13, v10, Lb5/L;->n:Ljava/lang/String;

    .line 721
    .line 722
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 723
    .line 724
    .line 725
    move-result v13

    .line 726
    if-eqz v13, :cond_16

    .line 727
    .line 728
    iget-object v13, v10, Lb5/L;->o:Ljava/lang/String;

    .line 729
    .line 730
    goto :goto_10

    .line 731
    :cond_16
    iget-object v13, v10, Lb5/L;->n:Ljava/lang/String;

    .line 732
    .line 733
    :goto_10
    invoke-virtual {v0, v8, v13, v1}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_5

    .line 734
    .line 735
    .line 736
    :cond_17
    :goto_11
    const/4 v14, 0x0

    .line 737
    goto :goto_13

    .line 738
    :goto_12
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 739
    .line 740
    .line 741
    invoke-static/range {v20 .. v20}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    const-string v8, "Fetching Google App Id failed with exception. appId"

    .line 746
    .line 747
    iget-object v13, v15, Lb5/V;->f:Lb5/T;

    .line 748
    .line 749
    invoke-virtual {v13, v1, v0, v8}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    goto :goto_11

    .line 753
    :goto_13
    iput-object v14, v10, Lb5/L;->k:Ljava/util/List;

    .line 754
    .line 755
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 756
    .line 757
    .line 758
    const-string v0, "analytics.safelisted_events"

    .line 759
    .line 760
    invoke-static {v0}, LF4/y;->e(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v2}, Lb5/g;->u0()Landroid/os/Bundle;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    iget-object v2, v2, LD/n;->a:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v2, Lb5/n0;

    .line 770
    .line 771
    if-nez v1, :cond_18

    .line 772
    .line 773
    iget-object v0, v2, Lb5/n0;->i:Lb5/V;

    .line 774
    .line 775
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 776
    .line 777
    .line 778
    const-string v1, "Failed to load metadata: Metadata bundle is null"

    .line 779
    .line 780
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 781
    .line 782
    invoke-virtual {v0, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    :goto_14
    move-object v0, v14

    .line 786
    goto :goto_15

    .line 787
    :cond_18
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 788
    .line 789
    .line 790
    move-result v8

    .line 791
    if-nez v8, :cond_19

    .line 792
    .line 793
    goto :goto_14

    .line 794
    :cond_19
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 795
    .line 796
    .line 797
    move-result v0

    .line 798
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    :goto_15
    if-eqz v0, :cond_1a

    .line 803
    .line 804
    :try_start_7
    iget-object v1, v2, Lb5/n0;->a:Landroid/content/Context;

    .line 805
    .line 806
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 807
    .line 808
    .line 809
    move-result-object v1

    .line 810
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 811
    .line 812
    .line 813
    move-result v0

    .line 814
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    if-nez v0, :cond_1b

    .line 819
    .line 820
    :cond_1a
    :goto_16
    move-object v13, v14

    .line 821
    goto :goto_17

    .line 822
    :cond_1b
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 823
    .line 824
    .line 825
    move-result-object v13
    :try_end_7
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_7 .. :try_end_7} :catch_6

    .line 826
    goto :goto_17

    .line 827
    :catch_6
    move-exception v0

    .line 828
    iget-object v1, v2, Lb5/n0;->i:Lb5/V;

    .line 829
    .line 830
    invoke-static {v1}, Lb5/n0;->f(Lb5/x0;)V

    .line 831
    .line 832
    .line 833
    const-string v2, "Failed to load string array from metadata: resource not found"

    .line 834
    .line 835
    iget-object v1, v1, Lb5/V;->f:Lb5/T;

    .line 836
    .line 837
    invoke-virtual {v1, v0, v2}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    goto :goto_16

    .line 841
    :goto_17
    if-nez v13, :cond_1c

    .line 842
    .line 843
    goto :goto_18

    .line 844
    :cond_1c
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 845
    .line 846
    .line 847
    move-result v0

    .line 848
    if-eqz v0, :cond_1d

    .line 849
    .line 850
    invoke-static {v15}, Lb5/n0;->f(Lb5/x0;)V

    .line 851
    .line 852
    .line 853
    const-string v0, "Safelisted event list is empty. Ignoring"

    .line 854
    .line 855
    iget-object v1, v15, Lb5/V;->k:Lb5/T;

    .line 856
    .line 857
    invoke-virtual {v1, v0}, Lb5/T;->b(Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    goto :goto_19

    .line 861
    :cond_1d
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 866
    .line 867
    .line 868
    move-result v1

    .line 869
    if-eqz v1, :cond_1f

    .line 870
    .line 871
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v1

    .line 875
    check-cast v1, Ljava/lang/String;

    .line 876
    .line 877
    iget-object v2, v11, Lb5/n0;->l:Lb5/P1;

    .line 878
    .line 879
    invoke-static {v2}, Lb5/n0;->d(LD/n;)V

    .line 880
    .line 881
    .line 882
    const-string v8, "safelisted event"

    .line 883
    .line 884
    invoke-virtual {v2, v8, v1}, Lb5/P1;->Y0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 885
    .line 886
    .line 887
    move-result v1

    .line 888
    if-nez v1, :cond_1e

    .line 889
    .line 890
    goto :goto_19

    .line 891
    :cond_1f
    :goto_18
    iput-object v13, v10, Lb5/L;->k:Ljava/util/List;

    .line 892
    .line 893
    :goto_19
    if-eqz v24, :cond_20

    .line 894
    .line 895
    invoke-static {v7}, LM4/a;->u(Landroid/content/Context;)Z

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    iput v0, v10, Lb5/L;->m:I

    .line 900
    .line 901
    goto :goto_1a

    .line 902
    :cond_20
    const/4 v2, 0x0

    .line 903
    iput v2, v10, Lb5/L;->m:I

    .line 904
    .line 905
    :goto_1a
    iget-object v0, v10, LD/n;->a:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, Lb5/n0;

    .line 908
    .line 909
    iget-object v0, v0, Lb5/n0;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 910
    .line 911
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 912
    .line 913
    .line 914
    const/4 v1, 0x1

    .line 915
    iput-boolean v1, v10, Lb5/B;->b:Z

    .line 916
    .line 917
    new-instance v0, Lb5/X0;

    .line 918
    .line 919
    invoke-direct {v0, v3}, Lb5/B;-><init>(Lb5/n0;)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v0}, Lb5/B;->n0()V

    .line 923
    .line 924
    .line 925
    iput-object v0, v3, Lb5/n0;->x:Lb5/X0;

    .line 926
    .line 927
    iget-boolean v1, v0, Lb5/B;->b:Z

    .line 928
    .line 929
    if-nez v1, :cond_58

    .line 930
    .line 931
    iget-object v1, v0, LD/n;->a:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v1, Lb5/n0;

    .line 934
    .line 935
    iget-object v1, v1, Lb5/n0;->a:Landroid/content/Context;

    .line 936
    .line 937
    const-string v2, "jobscheduler"

    .line 938
    .line 939
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v1

    .line 943
    check-cast v1, Landroid/app/job/JobScheduler;

    .line 944
    .line 945
    iput-object v1, v0, Lb5/X0;->c:Landroid/app/job/JobScheduler;

    .line 946
    .line 947
    iget-object v1, v0, LD/n;->a:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v1, Lb5/n0;

    .line 950
    .line 951
    iget-object v1, v1, Lb5/n0;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 952
    .line 953
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 954
    .line 955
    .line 956
    const/4 v1, 0x1

    .line 957
    iput-boolean v1, v0, Lb5/B;->b:Z

    .line 958
    .line 959
    iget-object v0, v3, Lb5/n0;->i:Lb5/V;

    .line 960
    .line 961
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 962
    .line 963
    .line 964
    invoke-virtual/range {v23 .. v23}, Lb5/g;->s0()J

    .line 965
    .line 966
    .line 967
    const-wide/32 v1, 0x1d0da

    .line 968
    .line 969
    .line 970
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 971
    .line 972
    .line 973
    move-result-object v1

    .line 974
    const-string v2, "App measurement initialized, version"

    .line 975
    .line 976
    iget-object v5, v0, Lb5/V;->l:Lb5/T;

    .line 977
    .line 978
    invoke-virtual {v5, v1, v2}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 982
    .line 983
    .line 984
    const-string v1, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    .line 985
    .line 986
    invoke-virtual {v5, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 987
    .line 988
    .line 989
    invoke-virtual/range {v22 .. v22}, Lb5/L;->r0()Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    iget-object v2, v3, Lb5/n0;->b:Ljava/lang/String;

    .line 994
    .line 995
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 996
    .line 997
    .line 998
    move-result v2

    .line 999
    move-object/from16 v14, v23

    .line 1000
    .line 1001
    if-eqz v2, :cond_22

    .line 1002
    .line 1003
    iget-object v2, v14, Lb5/g;->c:Ljava/lang/String;

    .line 1004
    .line 1005
    invoke-virtual {v4, v1, v2}, Lb5/P1;->b1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v2

    .line 1009
    if-eqz v2, :cond_21

    .line 1010
    .line 1011
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1012
    .line 1013
    .line 1014
    const-string v1, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    .line 1015
    .line 1016
    invoke-virtual {v5, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 1017
    .line 1018
    .line 1019
    goto :goto_1b

    .line 1020
    :cond_21
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    const-string v2, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    .line 1028
    .line 1029
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v1

    .line 1033
    invoke-virtual {v5, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    :cond_22
    :goto_1b
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1037
    .line 1038
    .line 1039
    const-string v1, "Debug-level message logging enabled"

    .line 1040
    .line 1041
    iget-object v2, v0, Lb5/V;->m:Lb5/T;

    .line 1042
    .line 1043
    invoke-virtual {v2, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 1044
    .line 1045
    .line 1046
    iget v1, v3, Lb5/n0;->D:I

    .line 1047
    .line 1048
    iget-object v7, v3, Lb5/n0;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1049
    .line 1050
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1051
    .line 1052
    .line 1053
    move-result v8

    .line 1054
    iget-object v10, v0, Lb5/V;->f:Lb5/T;

    .line 1055
    .line 1056
    if-eq v1, v8, :cond_23

    .line 1057
    .line 1058
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1059
    .line 1060
    .line 1061
    iget v1, v3, Lb5/n0;->D:I

    .line 1062
    .line 1063
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1068
    .line 1069
    .line 1070
    move-result v7

    .line 1071
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v7

    .line 1075
    const-string v8, "Not all components initialized"

    .line 1076
    .line 1077
    invoke-virtual {v10, v1, v7, v8}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1078
    .line 1079
    .line 1080
    :cond_23
    const/4 v1, 0x1

    .line 1081
    iput-boolean v1, v3, Lb5/n0;->y:Z

    .line 1082
    .line 1083
    iget-object v1, v3, Lb5/n0;->j:Lb5/m0;

    .line 1084
    .line 1085
    invoke-static {v1}, Lb5/n0;->f(Lb5/x0;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v1}, Lb5/m0;->l0()V

    .line 1089
    .line 1090
    .line 1091
    sget-object v1, Lb5/E;->S0:Lb5/D;

    .line 1092
    .line 1093
    const/4 v7, 0x0

    .line 1094
    invoke-virtual {v14, v7, v1}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v8

    .line 1098
    if-eqz v8, :cond_24

    .line 1099
    .line 1100
    iget-object v8, v3, Lb5/n0;->x:Lb5/X0;

    .line 1101
    .line 1102
    invoke-static {v8}, Lb5/n0;->c(Lb5/A;)V

    .line 1103
    .line 1104
    .line 1105
    iget-object v8, v3, Lb5/n0;->x:Lb5/X0;

    .line 1106
    .line 1107
    invoke-virtual {v8}, Lb5/X0;->p0()I

    .line 1108
    .line 1109
    .line 1110
    move-result v8

    .line 1111
    const/4 v13, 0x2

    .line 1112
    if-ne v8, v13, :cond_24

    .line 1113
    .line 1114
    const/4 v8, 0x1

    .line 1115
    goto :goto_1c

    .line 1116
    :cond_24
    const/4 v8, 0x0

    .line 1117
    :goto_1c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/K3;->b()V

    .line 1118
    .line 1119
    .line 1120
    sget-object v13, Lb5/E;->X0:Lb5/D;

    .line 1121
    .line 1122
    invoke-virtual {v14, v7, v13}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v13

    .line 1126
    const-wide/16 v15, 0x1

    .line 1127
    .line 1128
    if-eqz v13, :cond_25

    .line 1129
    .line 1130
    invoke-virtual {v4}, LD/n;->l0()V

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v4}, Lb5/P1;->u1()J

    .line 1134
    .line 1135
    .line 1136
    move-result-wide v19

    .line 1137
    cmp-long v13, v19, v15

    .line 1138
    .line 1139
    if-nez v13, :cond_25

    .line 1140
    .line 1141
    goto :goto_1d

    .line 1142
    :cond_25
    if-eqz v8, :cond_29

    .line 1143
    .line 1144
    const/4 v8, 0x1

    .line 1145
    :goto_1d
    invoke-virtual {v4}, LD/n;->l0()V

    .line 1146
    .line 1147
    .line 1148
    new-instance v13, Landroid/content/IntentFilter;

    .line 1149
    .line 1150
    invoke-direct {v13}, Landroid/content/IntentFilter;-><init>()V

    .line 1151
    .line 1152
    .line 1153
    move-wide/from16 v26, v15

    .line 1154
    .line 1155
    const-string v15, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    .line 1156
    .line 1157
    invoke-virtual {v13, v15}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    iget-object v15, v6, Lb5/n0;->g:Lb5/g;

    .line 1161
    .line 1162
    invoke-virtual {v15, v7, v1}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v1

    .line 1166
    if-eqz v1, :cond_26

    .line 1167
    .line 1168
    const-string v1, "com.google.android.gms.measurement.BATCHES_AVAILABLE"

    .line 1169
    .line 1170
    invoke-virtual {v13, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1171
    .line 1172
    .line 1173
    :cond_26
    new-instance v1, Landroidx/mediarouter/app/d;

    .line 1174
    .line 1175
    invoke-direct {v1, v6}, Landroidx/mediarouter/app/d;-><init>(Lb5/n0;)V

    .line 1176
    .line 1177
    .line 1178
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1179
    .line 1180
    const/16 v11, 0x21

    .line 1181
    .line 1182
    iget-object v7, v6, Lb5/n0;->a:Landroid/content/Context;

    .line 1183
    .line 1184
    if-lt v15, v11, :cond_27

    .line 1185
    .line 1186
    invoke-static {v7, v1, v13}, LE/b;->b(Landroid/content/Context;Landroidx/mediarouter/app/d;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1187
    .line 1188
    .line 1189
    goto :goto_1e

    .line 1190
    :cond_27
    const/16 v11, 0x1a

    .line 1191
    .line 1192
    if-lt v15, v11, :cond_28

    .line 1193
    .line 1194
    invoke-static {v7, v1, v13}, LE/b;->a(Landroid/content/Context;Landroidx/mediarouter/app/d;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1195
    .line 1196
    .line 1197
    goto :goto_1e

    .line 1198
    :cond_28
    const/4 v11, 0x0

    .line 1199
    invoke-virtual {v7, v1, v13, v11, v11}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1200
    .line 1201
    .line 1202
    :goto_1e
    iget-object v1, v6, Lb5/n0;->i:Lb5/V;

    .line 1203
    .line 1204
    invoke-static {v1}, Lb5/n0;->f(Lb5/x0;)V

    .line 1205
    .line 1206
    .line 1207
    const-string v7, "Registered app receiver"

    .line 1208
    .line 1209
    iget-object v1, v1, Lb5/V;->m:Lb5/T;

    .line 1210
    .line 1211
    invoke-virtual {v1, v7}, Lb5/T;->b(Ljava/lang/String;)V

    .line 1212
    .line 1213
    .line 1214
    if-eqz v8, :cond_2a

    .line 1215
    .line 1216
    iget-object v1, v3, Lb5/n0;->x:Lb5/X0;

    .line 1217
    .line 1218
    invoke-static {v1}, Lb5/n0;->c(Lb5/A;)V

    .line 1219
    .line 1220
    .line 1221
    iget-object v1, v3, Lb5/n0;->x:Lb5/X0;

    .line 1222
    .line 1223
    sget-object v7, Lb5/E;->C:Lb5/D;

    .line 1224
    .line 1225
    const/4 v11, 0x0

    .line 1226
    invoke-virtual {v7, v11}, Lb5/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v7

    .line 1230
    check-cast v7, Ljava/lang/Long;

    .line 1231
    .line 1232
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 1233
    .line 1234
    .line 1235
    move-result-wide v7

    .line 1236
    invoke-virtual {v1, v7, v8}, Lb5/X0;->q0(J)V

    .line 1237
    .line 1238
    .line 1239
    goto :goto_1f

    .line 1240
    :cond_29
    move-wide/from16 v26, v15

    .line 1241
    .line 1242
    :cond_2a
    :goto_1f
    invoke-virtual {v12}, Lb5/e0;->s0()Lb5/C0;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v1

    .line 1246
    const-string v7, "google_analytics_default_allow_ad_storage"

    .line 1247
    .line 1248
    const/4 v8, 0x0

    .line 1249
    invoke-virtual {v14, v7, v8}, Lb5/g;->v0(Ljava/lang/String;Z)Lb5/z0;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v7

    .line 1253
    const-string v11, "google_analytics_default_allow_analytics_storage"

    .line 1254
    .line 1255
    invoke-virtual {v14, v11, v8}, Lb5/g;->v0(Ljava/lang/String;Z)Lb5/z0;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v11

    .line 1259
    sget-object v8, Lb5/z0;->b:Lb5/z0;

    .line 1260
    .line 1261
    sget-object v13, Lb5/B0;->c:Lb5/B0;

    .line 1262
    .line 1263
    iget-object v9, v9, Lb5/F0;->g:Lcom/google/android/gms/internal/measurement/U;

    .line 1264
    .line 1265
    const-string v15, "consent_source"

    .line 1266
    .line 1267
    move-object/from16 v28, v6

    .line 1268
    .line 1269
    const-class v6, Lb5/B0;

    .line 1270
    .line 1271
    move-object/from16 v29, v5

    .line 1272
    .line 1273
    iget-object v5, v3, Lb5/n0;->p:Lb5/S0;

    .line 1274
    .line 1275
    move-object/from16 v30, v10

    .line 1276
    .line 1277
    if-ne v7, v8, :cond_2c

    .line 1278
    .line 1279
    if-eq v11, v8, :cond_2b

    .line 1280
    .line 1281
    goto :goto_20

    .line 1282
    :cond_2b
    move-object/from16 v31, v4

    .line 1283
    .line 1284
    goto :goto_21

    .line 1285
    :cond_2c
    :goto_20
    invoke-virtual {v12}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v10

    .line 1289
    move-object/from16 v31, v4

    .line 1290
    .line 1291
    const/16 v4, 0x64

    .line 1292
    .line 1293
    invoke-interface {v10, v15, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1294
    .line 1295
    .line 1296
    move-result v10

    .line 1297
    const/16 v4, -0xa

    .line 1298
    .line 1299
    invoke-static {v4, v10}, Lb5/C0;->l(II)Z

    .line 1300
    .line 1301
    .line 1302
    move-result v10

    .line 1303
    if-eqz v10, :cond_2d

    .line 1304
    .line 1305
    new-instance v10, Ljava/util/EnumMap;

    .line 1306
    .line 1307
    invoke-direct {v10, v6}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 1308
    .line 1309
    .line 1310
    sget-object v15, Lb5/B0;->b:Lb5/B0;

    .line 1311
    .line 1312
    invoke-virtual {v10, v15, v7}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v10, v13, v11}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    new-instance v7, Lb5/C0;

    .line 1319
    .line 1320
    invoke-direct {v7, v10, v4}, Lb5/C0;-><init>(Ljava/util/EnumMap;I)V

    .line 1321
    .line 1322
    .line 1323
    move-object v4, v7

    .line 1324
    const/4 v7, 0x0

    .line 1325
    goto/16 :goto_24

    .line 1326
    .line 1327
    :cond_2d
    :goto_21
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v4

    .line 1331
    invoke-virtual {v4}, Lb5/L;->s0()Ljava/lang/String;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v4

    .line 1335
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1336
    .line 1337
    .line 1338
    move-result v4

    .line 1339
    if-nez v4, :cond_2e

    .line 1340
    .line 1341
    iget v4, v1, Lb5/C0;->b:I

    .line 1342
    .line 1343
    if-eqz v4, :cond_2f

    .line 1344
    .line 1345
    const/16 v7, 0x1e

    .line 1346
    .line 1347
    if-eq v4, v7, :cond_2f

    .line 1348
    .line 1349
    const/16 v10, 0xa

    .line 1350
    .line 1351
    if-eq v4, v10, :cond_2f

    .line 1352
    .line 1353
    if-eq v4, v7, :cond_2f

    .line 1354
    .line 1355
    if-eq v4, v7, :cond_2f

    .line 1356
    .line 1357
    const/16 v7, 0x28

    .line 1358
    .line 1359
    if-ne v4, v7, :cond_2e

    .line 1360
    .line 1361
    goto :goto_22

    .line 1362
    :cond_2e
    const/4 v7, 0x0

    .line 1363
    goto :goto_23

    .line 1364
    :cond_2f
    :goto_22
    invoke-static {v5}, Lb5/n0;->e(Lb5/B;)V

    .line 1365
    .line 1366
    .line 1367
    new-instance v4, Lb5/C0;

    .line 1368
    .line 1369
    const/16 v7, -0xa

    .line 1370
    .line 1371
    invoke-direct {v4, v7}, Lb5/C0;-><init>(I)V

    .line 1372
    .line 1373
    .line 1374
    const/4 v7, 0x0

    .line 1375
    invoke-virtual {v5, v4, v7}, Lb5/S0;->E0(Lb5/C0;Z)V

    .line 1376
    .line 1377
    .line 1378
    :cond_30
    const/4 v4, 0x0

    .line 1379
    goto :goto_24

    .line 1380
    :goto_23
    sget-object v4, Lb5/E;->q1:Lb5/D;

    .line 1381
    .line 1382
    const/4 v11, 0x0

    .line 1383
    invoke-virtual {v14, v11, v4}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 1384
    .line 1385
    .line 1386
    move-result v4

    .line 1387
    if-nez v4, :cond_30

    .line 1388
    .line 1389
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v4

    .line 1393
    invoke-virtual {v4}, Lb5/L;->s0()Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v4

    .line 1397
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1398
    .line 1399
    .line 1400
    move-result v4

    .line 1401
    if-eqz v4, :cond_30

    .line 1402
    .line 1403
    if-eqz v9, :cond_30

    .line 1404
    .line 1405
    iget-object v4, v9, Lcom/google/android/gms/internal/measurement/U;->g:Landroid/os/Bundle;

    .line 1406
    .line 1407
    if-eqz v4, :cond_30

    .line 1408
    .line 1409
    invoke-virtual {v12}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v10

    .line 1413
    const/16 v11, 0x64

    .line 1414
    .line 1415
    invoke-interface {v10, v15, v11}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1416
    .line 1417
    .line 1418
    move-result v10

    .line 1419
    const/16 v11, 0x1e

    .line 1420
    .line 1421
    invoke-static {v11, v10}, Lb5/C0;->l(II)Z

    .line 1422
    .line 1423
    .line 1424
    move-result v10

    .line 1425
    if-eqz v10, :cond_30

    .line 1426
    .line 1427
    invoke-static {v11, v4}, Lb5/C0;->d(ILandroid/os/Bundle;)Lb5/C0;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v4

    .line 1431
    iget-object v10, v4, Lb5/C0;->a:Ljava/util/EnumMap;

    .line 1432
    .line 1433
    invoke-virtual {v10}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v10

    .line 1437
    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v10

    .line 1441
    :cond_31
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1442
    .line 1443
    .line 1444
    move-result v11

    .line 1445
    if-eqz v11, :cond_30

    .line 1446
    .line 1447
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v11

    .line 1451
    check-cast v11, Lb5/z0;

    .line 1452
    .line 1453
    if-eq v11, v8, :cond_31

    .line 1454
    .line 1455
    :goto_24
    if-eqz v4, :cond_32

    .line 1456
    .line 1457
    invoke-static {v5}, Lb5/n0;->e(Lb5/B;)V

    .line 1458
    .line 1459
    .line 1460
    const/4 v1, 0x1

    .line 1461
    invoke-virtual {v5, v4, v1}, Lb5/S0;->E0(Lb5/C0;Z)V

    .line 1462
    .line 1463
    .line 1464
    move-object v1, v4

    .line 1465
    :cond_32
    invoke-static {v5}, Lb5/n0;->e(Lb5/B;)V

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v5, v1}, Lb5/S0;->D0(Lb5/C0;)V

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {v12}, LD/n;->l0()V

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual {v12}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v1

    .line 1478
    const-string v4, "dma_consent_settings"

    .line 1479
    .line 1480
    const/4 v11, 0x0

    .line 1481
    invoke-interface {v1, v4, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v1

    .line 1485
    invoke-static {v1}, Lb5/p;->b(Ljava/lang/String;)Lb5/p;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v1

    .line 1489
    iget v1, v1, Lb5/p;->a:I

    .line 1490
    .line 1491
    const-string v4, "google_analytics_default_allow_ad_personalization_signals"

    .line 1492
    .line 1493
    const/4 v10, 0x1

    .line 1494
    invoke-virtual {v14, v4, v10}, Lb5/g;->v0(Ljava/lang/String;Z)Lb5/z0;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v4

    .line 1498
    iget-object v11, v0, Lb5/V;->n:Lb5/T;

    .line 1499
    .line 1500
    if-eq v4, v8, :cond_33

    .line 1501
    .line 1502
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1503
    .line 1504
    .line 1505
    const-string v15, "Default ad personalization consent from Manifest"

    .line 1506
    .line 1507
    invoke-virtual {v11, v4, v15}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1508
    .line 1509
    .line 1510
    :cond_33
    const-string v4, "google_analytics_default_allow_ad_user_data"

    .line 1511
    .line 1512
    invoke-virtual {v14, v4, v10}, Lb5/g;->v0(Ljava/lang/String;Z)Lb5/z0;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v4

    .line 1516
    iget-object v10, v5, LD/n;->a:Ljava/lang/Object;

    .line 1517
    .line 1518
    check-cast v10, Lb5/n0;

    .line 1519
    .line 1520
    if-eq v4, v8, :cond_35

    .line 1521
    .line 1522
    const/16 v15, -0xa

    .line 1523
    .line 1524
    invoke-static {v15, v1}, Lb5/C0;->l(II)Z

    .line 1525
    .line 1526
    .line 1527
    move-result v19

    .line 1528
    if-eqz v19, :cond_35

    .line 1529
    .line 1530
    invoke-static {v5}, Lb5/n0;->e(Lb5/B;)V

    .line 1531
    .line 1532
    .line 1533
    new-instance v1, Ljava/util/EnumMap;

    .line 1534
    .line 1535
    invoke-direct {v1, v6}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 1536
    .line 1537
    .line 1538
    sget-object v6, Lb5/B0;->d:Lb5/B0;

    .line 1539
    .line 1540
    invoke-virtual {v1, v6, v4}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    new-instance v4, Lb5/p;

    .line 1544
    .line 1545
    const/4 v6, 0x0

    .line 1546
    invoke-direct {v4, v1, v15, v6, v6}, Lb5/p;-><init>(Ljava/util/EnumMap;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 1547
    .line 1548
    .line 1549
    const/4 v1, 0x1

    .line 1550
    invoke-virtual {v5, v4, v1}, Lb5/S0;->C0(Lb5/p;Z)V

    .line 1551
    .line 1552
    .line 1553
    :cond_34
    :goto_25
    move-object v1, v5

    .line 1554
    move/from16 v23, v7

    .line 1555
    .line 1556
    goto/16 :goto_26

    .line 1557
    .line 1558
    :cond_35
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v4

    .line 1562
    invoke-virtual {v4}, Lb5/L;->s0()Ljava/lang/String;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v4

    .line 1566
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1567
    .line 1568
    .line 1569
    move-result v4

    .line 1570
    if-nez v4, :cond_37

    .line 1571
    .line 1572
    if-eqz v1, :cond_36

    .line 1573
    .line 1574
    const/16 v4, 0x1e

    .line 1575
    .line 1576
    if-ne v1, v4, :cond_37

    .line 1577
    .line 1578
    :cond_36
    invoke-static {v5}, Lb5/n0;->e(Lb5/B;)V

    .line 1579
    .line 1580
    .line 1581
    new-instance v1, Lb5/p;

    .line 1582
    .line 1583
    const/4 v6, 0x0

    .line 1584
    const/16 v15, -0xa

    .line 1585
    .line 1586
    invoke-direct {v1, v6, v15, v6, v6}, Lb5/p;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 1587
    .line 1588
    .line 1589
    const/4 v4, 0x1

    .line 1590
    invoke-virtual {v5, v1, v4}, Lb5/S0;->C0(Lb5/p;Z)V

    .line 1591
    .line 1592
    .line 1593
    goto :goto_25

    .line 1594
    :cond_37
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v4

    .line 1598
    invoke-virtual {v4}, Lb5/L;->s0()Ljava/lang/String;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v4

    .line 1602
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1603
    .line 1604
    .line 1605
    move-result v4

    .line 1606
    if-eqz v4, :cond_39

    .line 1607
    .line 1608
    if-eqz v9, :cond_39

    .line 1609
    .line 1610
    iget-object v4, v9, Lcom/google/android/gms/internal/measurement/U;->g:Landroid/os/Bundle;

    .line 1611
    .line 1612
    if-eqz v4, :cond_39

    .line 1613
    .line 1614
    const/16 v6, 0x1e

    .line 1615
    .line 1616
    invoke-static {v6, v1}, Lb5/C0;->l(II)Z

    .line 1617
    .line 1618
    .line 1619
    move-result v1

    .line 1620
    if-eqz v1, :cond_39

    .line 1621
    .line 1622
    invoke-static {v6, v4}, Lb5/p;->a(ILandroid/os/Bundle;)Lb5/p;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v1

    .line 1626
    iget-object v4, v1, Lb5/p;->e:Ljava/util/EnumMap;

    .line 1627
    .line 1628
    invoke-virtual {v4}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v4

    .line 1632
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v4

    .line 1636
    :cond_38
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1637
    .line 1638
    .line 1639
    move-result v6

    .line 1640
    if-eqz v6, :cond_39

    .line 1641
    .line 1642
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v6

    .line 1646
    check-cast v6, Lb5/z0;

    .line 1647
    .line 1648
    if-eq v6, v8, :cond_38

    .line 1649
    .line 1650
    invoke-static {v5}, Lb5/n0;->e(Lb5/B;)V

    .line 1651
    .line 1652
    .line 1653
    const/4 v4, 0x1

    .line 1654
    invoke-virtual {v5, v1, v4}, Lb5/S0;->C0(Lb5/p;Z)V

    .line 1655
    .line 1656
    .line 1657
    :cond_39
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v1

    .line 1661
    invoke-virtual {v1}, Lb5/L;->s0()Ljava/lang/String;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v1

    .line 1665
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1666
    .line 1667
    .line 1668
    move-result v1

    .line 1669
    if-eqz v1, :cond_34

    .line 1670
    .line 1671
    if-eqz v9, :cond_34

    .line 1672
    .line 1673
    iget-object v1, v9, Lcom/google/android/gms/internal/measurement/U;->g:Landroid/os/Bundle;

    .line 1674
    .line 1675
    if-eqz v1, :cond_34

    .line 1676
    .line 1677
    iget-object v4, v12, Lb5/e0;->n:LA6/t;

    .line 1678
    .line 1679
    invoke-virtual {v4}, LA6/t;->m()Ljava/lang/String;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v4

    .line 1683
    if-nez v4, :cond_34

    .line 1684
    .line 1685
    invoke-static {v1}, Lb5/p;->d(Landroid/os/Bundle;)Ljava/lang/Boolean;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v1

    .line 1689
    if-eqz v1, :cond_34

    .line 1690
    .line 1691
    invoke-static {v5}, Lb5/n0;->e(Lb5/B;)V

    .line 1692
    .line 1693
    .line 1694
    invoke-virtual {v1}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v22

    .line 1698
    iget-object v1, v10, Lb5/n0;->n:LK4/a;

    .line 1699
    .line 1700
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1701
    .line 1702
    .line 1703
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1704
    .line 1705
    .line 1706
    move-result-wide v24

    .line 1707
    iget-object v1, v9, Lcom/google/android/gms/internal/measurement/U;->e:Ljava/lang/String;

    .line 1708
    .line 1709
    const-string v21, "allow_personalized_ads"

    .line 1710
    .line 1711
    move-object/from16 v20, v1

    .line 1712
    .line 1713
    move-object/from16 v19, v5

    .line 1714
    .line 1715
    move/from16 v23, v7

    .line 1716
    .line 1717
    invoke-virtual/range {v19 .. v25}, Lb5/S0;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 1718
    .line 1719
    .line 1720
    move-object/from16 v1, v19

    .line 1721
    .line 1722
    :goto_26
    const-string v4, "google_analytics_tcf_data_enabled"

    .line 1723
    .line 1724
    invoke-virtual {v14, v4}, Lb5/g;->w0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v4

    .line 1728
    if-nez v4, :cond_3a

    .line 1729
    .line 1730
    goto :goto_27

    .line 1731
    :cond_3a
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1732
    .line 1733
    .line 1734
    move-result v4

    .line 1735
    if-eqz v4, :cond_3c

    .line 1736
    .line 1737
    :goto_27
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1738
    .line 1739
    .line 1740
    const-string v4, "TCF client enabled."

    .line 1741
    .line 1742
    invoke-virtual {v2, v4}, Lb5/T;->b(Ljava/lang/String;)V

    .line 1743
    .line 1744
    .line 1745
    invoke-static {v1}, Lb5/n0;->e(Lb5/B;)V

    .line 1746
    .line 1747
    .line 1748
    invoke-virtual {v1}, Lb5/A;->l0()V

    .line 1749
    .line 1750
    .line 1751
    iget-object v2, v10, Lb5/n0;->i:Lb5/V;

    .line 1752
    .line 1753
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 1754
    .line 1755
    .line 1756
    const-string v4, "Register tcfPrefChangeListener."

    .line 1757
    .line 1758
    iget-object v2, v2, Lb5/V;->m:Lb5/T;

    .line 1759
    .line 1760
    invoke-virtual {v2, v4}, Lb5/T;->b(Ljava/lang/String;)V

    .line 1761
    .line 1762
    .line 1763
    iget-object v2, v1, Lb5/S0;->u:Lb5/L0;

    .line 1764
    .line 1765
    if-nez v2, :cond_3b

    .line 1766
    .line 1767
    new-instance v2, Lb5/M0;

    .line 1768
    .line 1769
    const/4 v4, 0x2

    .line 1770
    invoke-direct {v2, v1, v10, v4}, Lb5/M0;-><init>(Lb5/S0;Lb5/y0;I)V

    .line 1771
    .line 1772
    .line 1773
    iput-object v2, v1, Lb5/S0;->v:Lb5/M0;

    .line 1774
    .line 1775
    new-instance v2, Lb5/L0;

    .line 1776
    .line 1777
    invoke-direct {v2, v1}, Lb5/L0;-><init>(Lb5/S0;)V

    .line 1778
    .line 1779
    .line 1780
    iput-object v2, v1, Lb5/S0;->u:Lb5/L0;

    .line 1781
    .line 1782
    :cond_3b
    iget-object v2, v10, Lb5/n0;->h:Lb5/e0;

    .line 1783
    .line 1784
    invoke-static {v2}, Lb5/n0;->d(LD/n;)V

    .line 1785
    .line 1786
    .line 1787
    invoke-virtual {v2}, Lb5/e0;->p0()Landroid/content/SharedPreferences;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v2

    .line 1791
    iget-object v4, v1, Lb5/S0;->u:Lb5/L0;

    .line 1792
    .line 1793
    invoke-interface {v2, v4}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 1794
    .line 1795
    .line 1796
    invoke-static {v1}, Lb5/n0;->e(Lb5/B;)V

    .line 1797
    .line 1798
    .line 1799
    invoke-virtual {v1}, Lb5/S0;->u0()V

    .line 1800
    .line 1801
    .line 1802
    :cond_3c
    iget-object v2, v12, Lb5/e0;->g:Lb5/c0;

    .line 1803
    .line 1804
    invoke-virtual {v2}, Lb5/c0;->f()J

    .line 1805
    .line 1806
    .line 1807
    move-result-wide v4

    .line 1808
    cmp-long v4, v4, v17

    .line 1809
    .line 1810
    iget-wide v5, v3, Lb5/n0;->Z:J

    .line 1811
    .line 1812
    if-nez v4, :cond_3d

    .line 1813
    .line 1814
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1815
    .line 1816
    .line 1817
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v4

    .line 1821
    const-string v7, "Persisting first open"

    .line 1822
    .line 1823
    invoke-virtual {v11, v4, v7}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1824
    .line 1825
    .line 1826
    invoke-virtual {v2, v5, v6}, Lb5/c0;->g(J)V

    .line 1827
    .line 1828
    .line 1829
    :cond_3d
    invoke-static {v1}, Lb5/n0;->e(Lb5/B;)V

    .line 1830
    .line 1831
    .line 1832
    iget-object v4, v1, Lb5/S0;->r:Ls4/i;

    .line 1833
    .line 1834
    invoke-virtual {v4}, Ls4/i;->a0()Z

    .line 1835
    .line 1836
    .line 1837
    move-result v7

    .line 1838
    if-eqz v7, :cond_3e

    .line 1839
    .line 1840
    invoke-virtual {v4}, Ls4/i;->b0()Z

    .line 1841
    .line 1842
    .line 1843
    move-result v7

    .line 1844
    if-eqz v7, :cond_3e

    .line 1845
    .line 1846
    iget-object v4, v4, Ls4/i;->a:Ljava/lang/Object;

    .line 1847
    .line 1848
    check-cast v4, Lb5/n0;

    .line 1849
    .line 1850
    iget-object v4, v4, Lb5/n0;->h:Lb5/e0;

    .line 1851
    .line 1852
    invoke-static {v4}, Lb5/n0;->d(LD/n;)V

    .line 1853
    .line 1854
    .line 1855
    iget-object v4, v4, Lb5/e0;->x:LA6/t;

    .line 1856
    .line 1857
    const/4 v7, 0x0

    .line 1858
    invoke-virtual {v4, v7}, LA6/t;->n(Ljava/lang/String;)V

    .line 1859
    .line 1860
    .line 1861
    :cond_3e
    invoke-virtual {v3}, Lb5/n0;->b()Z

    .line 1862
    .line 1863
    .line 1864
    move-result v4

    .line 1865
    if-nez v4, :cond_44

    .line 1866
    .line 1867
    invoke-virtual {v3}, Lb5/n0;->a()Z

    .line 1868
    .line 1869
    .line 1870
    move-result v2

    .line 1871
    if-eqz v2, :cond_43

    .line 1872
    .line 1873
    const-string v2, "android.permission.INTERNET"

    .line 1874
    .line 1875
    move-object/from16 v4, v31

    .line 1876
    .line 1877
    invoke-virtual {v4, v2}, Lb5/P1;->a1(Ljava/lang/String;)Z

    .line 1878
    .line 1879
    .line 1880
    move-result v2

    .line 1881
    if-nez v2, :cond_3f

    .line 1882
    .line 1883
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1884
    .line 1885
    .line 1886
    const-string v2, "App is missing INTERNET permission"

    .line 1887
    .line 1888
    move-object/from16 v5, v30

    .line 1889
    .line 1890
    invoke-virtual {v5, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 1891
    .line 1892
    .line 1893
    goto :goto_28

    .line 1894
    :cond_3f
    move-object/from16 v5, v30

    .line 1895
    .line 1896
    :goto_28
    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    .line 1897
    .line 1898
    invoke-virtual {v4, v2}, Lb5/P1;->a1(Ljava/lang/String;)Z

    .line 1899
    .line 1900
    .line 1901
    move-result v2

    .line 1902
    if-nez v2, :cond_40

    .line 1903
    .line 1904
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1905
    .line 1906
    .line 1907
    const-string v2, "App is missing ACCESS_NETWORK_STATE permission"

    .line 1908
    .line 1909
    invoke-virtual {v5, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 1910
    .line 1911
    .line 1912
    :cond_40
    iget-object v2, v3, Lb5/n0;->a:Landroid/content/Context;

    .line 1913
    .line 1914
    invoke-static {v2}, LM4/c;->a(Landroid/content/Context;)LM4/b;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v6

    .line 1918
    invoke-virtual {v6}, LM4/b;->d()Z

    .line 1919
    .line 1920
    .line 1921
    move-result v6

    .line 1922
    if-nez v6, :cond_42

    .line 1923
    .line 1924
    invoke-virtual {v14}, Lb5/g;->o0()Z

    .line 1925
    .line 1926
    .line 1927
    move-result v6

    .line 1928
    if-nez v6, :cond_42

    .line 1929
    .line 1930
    invoke-static {v2}, Lb5/P1;->h1(Landroid/content/Context;)Z

    .line 1931
    .line 1932
    .line 1933
    move-result v6

    .line 1934
    if-nez v6, :cond_41

    .line 1935
    .line 1936
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1937
    .line 1938
    .line 1939
    const-string v6, "AppMeasurementReceiver not registered/enabled"

    .line 1940
    .line 1941
    invoke-virtual {v5, v6}, Lb5/T;->b(Ljava/lang/String;)V

    .line 1942
    .line 1943
    .line 1944
    :cond_41
    invoke-static {v2}, Lb5/P1;->j1(Landroid/content/Context;)Z

    .line 1945
    .line 1946
    .line 1947
    move-result v2

    .line 1948
    if-nez v2, :cond_42

    .line 1949
    .line 1950
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1951
    .line 1952
    .line 1953
    const-string v2, "AppMeasurementService not registered/enabled"

    .line 1954
    .line 1955
    invoke-virtual {v5, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 1956
    .line 1957
    .line 1958
    :cond_42
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 1959
    .line 1960
    .line 1961
    const-string v2, "Uploading is not possible. App measurement disabled"

    .line 1962
    .line 1963
    invoke-virtual {v5, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 1964
    .line 1965
    .line 1966
    :goto_29
    move-object v6, v0

    .line 1967
    move-object/from16 v19, v10

    .line 1968
    .line 1969
    move-object/from16 v20, v11

    .line 1970
    .line 1971
    move-object v2, v12

    .line 1972
    goto/16 :goto_33

    .line 1973
    .line 1974
    :cond_43
    move-object/from16 v4, v31

    .line 1975
    .line 1976
    goto :goto_29

    .line 1977
    :cond_44
    move-object/from16 v4, v31

    .line 1978
    .line 1979
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v8

    .line 1983
    invoke-virtual {v8}, Lb5/L;->s0()Ljava/lang/String;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v8

    .line 1987
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1988
    .line 1989
    .line 1990
    move-result v8

    .line 1991
    iget-object v9, v12, Lb5/e0;->h:LA6/t;

    .line 1992
    .line 1993
    if-eqz v8, :cond_46

    .line 1994
    .line 1995
    sget-object v8, Lb5/E;->q1:Lb5/D;

    .line 1996
    .line 1997
    const/4 v15, 0x0

    .line 1998
    invoke-virtual {v14, v15, v8}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 1999
    .line 2000
    .line 2001
    move-result v8

    .line 2002
    if-nez v8, :cond_45

    .line 2003
    .line 2004
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v8

    .line 2008
    invoke-virtual {v8}, Lb5/L;->q0()Ljava/lang/String;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v8

    .line 2012
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2013
    .line 2014
    .line 2015
    move-result v8

    .line 2016
    if-nez v8, :cond_45

    .line 2017
    .line 2018
    goto :goto_2a

    .line 2019
    :cond_45
    move-object/from16 v21, v0

    .line 2020
    .line 2021
    move-object/from16 v24, v1

    .line 2022
    .line 2023
    move-object/from16 v19, v10

    .line 2024
    .line 2025
    move-object/from16 v20, v11

    .line 2026
    .line 2027
    move-object/from16 v22, v12

    .line 2028
    .line 2029
    goto/16 :goto_2f

    .line 2030
    .line 2031
    :cond_46
    const/4 v15, 0x0

    .line 2032
    :goto_2a
    sget-object v8, Lb5/E;->q1:Lb5/D;

    .line 2033
    .line 2034
    invoke-virtual {v14, v15, v8}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 2035
    .line 2036
    .line 2037
    move-result v16

    .line 2038
    const-string v7, "admob_app_id"

    .line 2039
    .line 2040
    const-string v15, "gmp_app_id"

    .line 2041
    .line 2042
    if-eqz v16, :cond_48

    .line 2043
    .line 2044
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 2045
    .line 2046
    .line 2047
    move-result-object v16

    .line 2048
    move-object/from16 v19, v10

    .line 2049
    .line 2050
    invoke-virtual/range {v16 .. v16}, Lb5/L;->s0()Ljava/lang/String;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v10

    .line 2054
    invoke-virtual {v12}, LD/n;->l0()V

    .line 2055
    .line 2056
    .line 2057
    move-object/from16 v20, v11

    .line 2058
    .line 2059
    invoke-virtual {v12}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v11

    .line 2063
    move-object/from16 v21, v0

    .line 2064
    .line 2065
    const/4 v0, 0x0

    .line 2066
    invoke-interface {v11, v15, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v11

    .line 2070
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2071
    .line 2072
    .line 2073
    move-result v0

    .line 2074
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2075
    .line 2076
    .line 2077
    move-result v18

    .line 2078
    if-nez v0, :cond_47

    .line 2079
    .line 2080
    if-nez v18, :cond_47

    .line 2081
    .line 2082
    invoke-static {v10}, LF4/y;->h(Ljava/lang/Object;)V

    .line 2083
    .line 2084
    .line 2085
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2086
    .line 2087
    .line 2088
    move-result v0

    .line 2089
    if-nez v0, :cond_47

    .line 2090
    .line 2091
    const/4 v0, 0x1

    .line 2092
    goto :goto_2b

    .line 2093
    :cond_47
    const/4 v0, 0x0

    .line 2094
    :goto_2b
    move-object/from16 v24, v1

    .line 2095
    .line 2096
    move-object/from16 v22, v12

    .line 2097
    .line 2098
    goto :goto_2c

    .line 2099
    :cond_48
    move-object/from16 v21, v0

    .line 2100
    .line 2101
    move-object/from16 v19, v10

    .line 2102
    .line 2103
    move-object/from16 v20, v11

    .line 2104
    .line 2105
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v0

    .line 2109
    invoke-virtual {v0}, Lb5/L;->s0()Ljava/lang/String;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v0

    .line 2113
    invoke-virtual {v12}, LD/n;->l0()V

    .line 2114
    .line 2115
    .line 2116
    invoke-virtual {v12}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v10

    .line 2120
    const/4 v11, 0x0

    .line 2121
    invoke-interface {v10, v15, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v10

    .line 2125
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 2126
    .line 2127
    .line 2128
    move-result-object v16

    .line 2129
    invoke-virtual/range {v16 .. v16}, Lb5/L;->q0()Ljava/lang/String;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v11

    .line 2133
    invoke-virtual {v12}, LD/n;->l0()V

    .line 2134
    .line 2135
    .line 2136
    move-object/from16 v22, v12

    .line 2137
    .line 2138
    invoke-virtual/range {v22 .. v22}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v12

    .line 2142
    move-object/from16 v24, v1

    .line 2143
    .line 2144
    const/4 v1, 0x0

    .line 2145
    invoke-interface {v12, v7, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v12

    .line 2149
    invoke-virtual {v4, v0, v10, v11, v12}, Lb5/P1;->k1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 2150
    .line 2151
    .line 2152
    move-result v0

    .line 2153
    :goto_2c
    if-eqz v0, :cond_4b

    .line 2154
    .line 2155
    invoke-static/range {v21 .. v21}, Lb5/n0;->f(Lb5/x0;)V

    .line 2156
    .line 2157
    .line 2158
    const-string v0, "Rechecking which service to use due to a GMP App Id change"

    .line 2159
    .line 2160
    move-object/from16 v1, v29

    .line 2161
    .line 2162
    invoke-virtual {v1, v0}, Lb5/T;->b(Ljava/lang/String;)V

    .line 2163
    .line 2164
    .line 2165
    invoke-virtual/range {v22 .. v22}, LD/n;->l0()V

    .line 2166
    .line 2167
    .line 2168
    invoke-virtual/range {v22 .. v22}, LD/n;->l0()V

    .line 2169
    .line 2170
    .line 2171
    invoke-virtual/range {v22 .. v22}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 2172
    .line 2173
    .line 2174
    move-result-object v0

    .line 2175
    const-string v1, "measurement_enabled"

    .line 2176
    .line 2177
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 2178
    .line 2179
    .line 2180
    move-result v0

    .line 2181
    if-eqz v0, :cond_49

    .line 2182
    .line 2183
    invoke-virtual/range {v22 .. v22}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 2184
    .line 2185
    .line 2186
    move-result-object v0

    .line 2187
    const/4 v10, 0x1

    .line 2188
    invoke-interface {v0, v1, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 2189
    .line 2190
    .line 2191
    move-result v0

    .line 2192
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2193
    .line 2194
    .line 2195
    move-result-object v0

    .line 2196
    goto :goto_2d

    .line 2197
    :cond_49
    const/4 v0, 0x0

    .line 2198
    :goto_2d
    invoke-virtual/range {v22 .. v22}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v10

    .line 2202
    invoke-interface {v10}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v10

    .line 2206
    invoke-interface {v10}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 2207
    .line 2208
    .line 2209
    invoke-interface {v10}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2210
    .line 2211
    .line 2212
    if-eqz v0, :cond_4a

    .line 2213
    .line 2214
    invoke-virtual/range {v22 .. v22}, LD/n;->l0()V

    .line 2215
    .line 2216
    .line 2217
    invoke-virtual/range {v22 .. v22}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v10

    .line 2221
    invoke-interface {v10}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v10

    .line 2225
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2226
    .line 2227
    .line 2228
    move-result v0

    .line 2229
    invoke-interface {v10, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 2230
    .line 2231
    .line 2232
    invoke-interface {v10}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2233
    .line 2234
    .line 2235
    :cond_4a
    invoke-virtual {v3}, Lb5/n0;->j()Lb5/N;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v0

    .line 2239
    invoke-virtual {v0}, Lb5/N;->q0()V

    .line 2240
    .line 2241
    .line 2242
    iget-object v0, v3, Lb5/n0;->u:Lb5/m1;

    .line 2243
    .line 2244
    invoke-virtual {v0}, Lb5/m1;->q0()V

    .line 2245
    .line 2246
    .line 2247
    iget-object v0, v3, Lb5/n0;->u:Lb5/m1;

    .line 2248
    .line 2249
    invoke-virtual {v0}, Lb5/m1;->p0()V

    .line 2250
    .line 2251
    .line 2252
    invoke-virtual {v2, v5, v6}, Lb5/c0;->g(J)V

    .line 2253
    .line 2254
    .line 2255
    const/4 v11, 0x0

    .line 2256
    invoke-virtual {v9, v11}, LA6/t;->n(Ljava/lang/String;)V

    .line 2257
    .line 2258
    .line 2259
    goto :goto_2e

    .line 2260
    :cond_4b
    const/4 v11, 0x0

    .line 2261
    :goto_2e
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v0

    .line 2265
    invoke-virtual {v0}, Lb5/L;->s0()Ljava/lang/String;

    .line 2266
    .line 2267
    .line 2268
    move-result-object v0

    .line 2269
    invoke-virtual/range {v22 .. v22}, LD/n;->l0()V

    .line 2270
    .line 2271
    .line 2272
    invoke-virtual/range {v22 .. v22}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v1

    .line 2276
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v1

    .line 2280
    invoke-interface {v1, v15, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2281
    .line 2282
    .line 2283
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2284
    .line 2285
    .line 2286
    invoke-virtual {v14, v11, v8}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 2287
    .line 2288
    .line 2289
    move-result v0

    .line 2290
    if-eqz v0, :cond_4c

    .line 2291
    .line 2292
    invoke-virtual/range {v22 .. v22}, LD/n;->l0()V

    .line 2293
    .line 2294
    .line 2295
    invoke-virtual/range {v22 .. v22}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v0

    .line 2299
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2300
    .line 2301
    .line 2302
    move-result-object v0

    .line 2303
    invoke-interface {v0, v7, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2304
    .line 2305
    .line 2306
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2307
    .line 2308
    .line 2309
    goto :goto_2f

    .line 2310
    :cond_4c
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 2311
    .line 2312
    .line 2313
    move-result-object v0

    .line 2314
    invoke-virtual {v0}, Lb5/L;->q0()Ljava/lang/String;

    .line 2315
    .line 2316
    .line 2317
    move-result-object v0

    .line 2318
    invoke-virtual/range {v22 .. v22}, LD/n;->l0()V

    .line 2319
    .line 2320
    .line 2321
    invoke-virtual/range {v22 .. v22}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v1

    .line 2325
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2326
    .line 2327
    .line 2328
    move-result-object v1

    .line 2329
    invoke-interface {v1, v7, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2330
    .line 2331
    .line 2332
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2333
    .line 2334
    .line 2335
    :goto_2f
    invoke-virtual/range {v22 .. v22}, Lb5/e0;->s0()Lb5/C0;

    .line 2336
    .line 2337
    .line 2338
    move-result-object v0

    .line 2339
    invoke-virtual {v0, v13}, Lb5/C0;->k(Lb5/B0;)Z

    .line 2340
    .line 2341
    .line 2342
    move-result v0

    .line 2343
    if-nez v0, :cond_4d

    .line 2344
    .line 2345
    const/4 v11, 0x0

    .line 2346
    invoke-virtual {v9, v11}, LA6/t;->n(Ljava/lang/String;)V

    .line 2347
    .line 2348
    .line 2349
    :cond_4d
    invoke-static/range {v24 .. v24}, Lb5/n0;->e(Lb5/B;)V

    .line 2350
    .line 2351
    .line 2352
    invoke-virtual {v9}, LA6/t;->m()Ljava/lang/String;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v0

    .line 2356
    move-object/from16 v1, v24

    .line 2357
    .line 2358
    iget-object v2, v1, Lb5/S0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2359
    .line 2360
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 2361
    .line 2362
    .line 2363
    move-object/from16 v2, v28

    .line 2364
    .line 2365
    :try_start_8
    iget-object v0, v2, Lb5/n0;->a:Landroid/content/Context;

    .line 2366
    .line 2367
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2368
    .line 2369
    .line 2370
    move-result-object v0

    .line 2371
    const-string v2, "com.google.firebase.remoteconfig.FirebaseRemoteConfig"

    .line 2372
    .line 2373
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_7

    .line 2374
    .line 2375
    .line 2376
    move-object/from16 v6, v21

    .line 2377
    .line 2378
    move-object/from16 v2, v22

    .line 2379
    .line 2380
    :goto_30
    const/4 v11, 0x0

    .line 2381
    goto :goto_31

    .line 2382
    :catch_7
    move-object/from16 v2, v22

    .line 2383
    .line 2384
    iget-object v0, v2, Lb5/e0;->w:LA6/t;

    .line 2385
    .line 2386
    invoke-virtual {v0}, LA6/t;->m()Ljava/lang/String;

    .line 2387
    .line 2388
    .line 2389
    move-result-object v5

    .line 2390
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2391
    .line 2392
    .line 2393
    move-result v5

    .line 2394
    if-nez v5, :cond_4e

    .line 2395
    .line 2396
    invoke-static/range {v21 .. v21}, Lb5/n0;->f(Lb5/x0;)V

    .line 2397
    .line 2398
    .line 2399
    const-string v5, "Remote config removed with active feature rollouts"

    .line 2400
    .line 2401
    move-object/from16 v6, v21

    .line 2402
    .line 2403
    iget-object v7, v6, Lb5/V;->i:Lb5/T;

    .line 2404
    .line 2405
    invoke-virtual {v7, v5}, Lb5/T;->b(Ljava/lang/String;)V

    .line 2406
    .line 2407
    .line 2408
    const/4 v11, 0x0

    .line 2409
    invoke-virtual {v0, v11}, LA6/t;->n(Ljava/lang/String;)V

    .line 2410
    .line 2411
    .line 2412
    goto :goto_31

    .line 2413
    :cond_4e
    move-object/from16 v6, v21

    .line 2414
    .line 2415
    goto :goto_30

    .line 2416
    :goto_31
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 2417
    .line 2418
    .line 2419
    move-result-object v0

    .line 2420
    invoke-virtual {v0}, Lb5/L;->s0()Ljava/lang/String;

    .line 2421
    .line 2422
    .line 2423
    move-result-object v0

    .line 2424
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2425
    .line 2426
    .line 2427
    move-result v0

    .line 2428
    if-eqz v0, :cond_4f

    .line 2429
    .line 2430
    sget-object v0, Lb5/E;->q1:Lb5/D;

    .line 2431
    .line 2432
    invoke-virtual {v14, v11, v0}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 2433
    .line 2434
    .line 2435
    move-result v0

    .line 2436
    if-nez v0, :cond_53

    .line 2437
    .line 2438
    invoke-virtual {v3}, Lb5/n0;->i()Lb5/L;

    .line 2439
    .line 2440
    .line 2441
    move-result-object v0

    .line 2442
    invoke-virtual {v0}, Lb5/L;->q0()Ljava/lang/String;

    .line 2443
    .line 2444
    .line 2445
    move-result-object v0

    .line 2446
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2447
    .line 2448
    .line 2449
    move-result v0

    .line 2450
    if-nez v0, :cond_53

    .line 2451
    .line 2452
    :cond_4f
    invoke-virtual {v3}, Lb5/n0;->a()Z

    .line 2453
    .line 2454
    .line 2455
    move-result v0

    .line 2456
    iget-object v5, v2, Lb5/e0;->c:Landroid/content/SharedPreferences;

    .line 2457
    .line 2458
    if-nez v5, :cond_50

    .line 2459
    .line 2460
    move/from16 v11, v23

    .line 2461
    .line 2462
    goto :goto_32

    .line 2463
    :cond_50
    const-string v7, "deferred_analytics_collection"

    .line 2464
    .line 2465
    invoke-interface {v5, v7}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 2466
    .line 2467
    .line 2468
    move-result v11

    .line 2469
    :goto_32
    if-nez v11, :cond_51

    .line 2470
    .line 2471
    invoke-virtual {v14}, Lb5/g;->m0()Z

    .line 2472
    .line 2473
    .line 2474
    move-result v5

    .line 2475
    if-nez v5, :cond_51

    .line 2476
    .line 2477
    xor-int/lit8 v5, v0, 0x1

    .line 2478
    .line 2479
    invoke-virtual {v2, v5}, Lb5/e0;->t0(Z)V

    .line 2480
    .line 2481
    .line 2482
    :cond_51
    if-eqz v0, :cond_52

    .line 2483
    .line 2484
    invoke-static {v1}, Lb5/n0;->e(Lb5/B;)V

    .line 2485
    .line 2486
    .line 2487
    invoke-virtual {v1}, Lb5/S0;->q0()V

    .line 2488
    .line 2489
    .line 2490
    :cond_52
    iget-object v0, v3, Lb5/n0;->k:Lb5/t1;

    .line 2491
    .line 2492
    invoke-static {v0}, Lb5/n0;->e(Lb5/B;)V

    .line 2493
    .line 2494
    .line 2495
    iget-object v0, v0, Lb5/t1;->e:Lo1/f;

    .line 2496
    .line 2497
    invoke-virtual {v0}, Lo1/f;->L()V

    .line 2498
    .line 2499
    .line 2500
    invoke-virtual {v3}, Lb5/n0;->m()Lb5/m1;

    .line 2501
    .line 2502
    .line 2503
    move-result-object v0

    .line 2504
    new-instance v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2505
    .line 2506
    invoke-direct {v5}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2507
    .line 2508
    .line 2509
    invoke-virtual {v0, v5}, Lb5/m1;->r0(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 2510
    .line 2511
    .line 2512
    invoke-virtual {v3}, Lb5/n0;->m()Lb5/m1;

    .line 2513
    .line 2514
    .line 2515
    move-result-object v0

    .line 2516
    iget-object v5, v2, Lb5/e0;->z:Lcom/google/firebase/messaging/s;

    .line 2517
    .line 2518
    invoke-virtual {v5}, Lcom/google/firebase/messaging/s;->w()Landroid/os/Bundle;

    .line 2519
    .line 2520
    .line 2521
    move-result-object v5

    .line 2522
    invoke-virtual {v0, v5}, Lb5/m1;->u0(Landroid/os/Bundle;)V

    .line 2523
    .line 2524
    .line 2525
    :cond_53
    :goto_33
    invoke-static {}, Lcom/google/android/gms/internal/measurement/K3;->b()V

    .line 2526
    .line 2527
    .line 2528
    sget-object v0, Lb5/E;->X0:Lb5/D;

    .line 2529
    .line 2530
    const/4 v11, 0x0

    .line 2531
    invoke-virtual {v14, v11, v0}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 2532
    .line 2533
    .line 2534
    move-result v0

    .line 2535
    if-eqz v0, :cond_57

    .line 2536
    .line 2537
    invoke-virtual {v4}, LD/n;->l0()V

    .line 2538
    .line 2539
    .line 2540
    invoke-virtual {v4}, Lb5/P1;->u1()J

    .line 2541
    .line 2542
    .line 2543
    move-result-wide v4

    .line 2544
    cmp-long v0, v4, v26

    .line 2545
    .line 2546
    if-nez v0, :cond_54

    .line 2547
    .line 2548
    const/16 v17, 0x1

    .line 2549
    .line 2550
    goto :goto_34

    .line 2551
    :cond_54
    const/16 v17, 0x0

    .line 2552
    .line 2553
    :goto_34
    if-eqz v17, :cond_57

    .line 2554
    .line 2555
    sget-object v0, Lb5/E;->x0:Lb5/D;

    .line 2556
    .line 2557
    invoke-virtual {v0, v11}, Lb5/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2558
    .line 2559
    .line 2560
    move-result-object v0

    .line 2561
    check-cast v0, Ljava/lang/Integer;

    .line 2562
    .line 2563
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2564
    .line 2565
    .line 2566
    move-result v0

    .line 2567
    int-to-long v4, v0

    .line 2568
    new-instance v0, Ljava/util/Random;

    .line 2569
    .line 2570
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 2571
    .line 2572
    .line 2573
    const/16 v7, 0x1388

    .line 2574
    .line 2575
    invoke-virtual {v0, v7}, Ljava/util/Random;->nextInt(I)I

    .line 2576
    .line 2577
    .line 2578
    move-result v0

    .line 2579
    const-wide/16 v7, 0x3e8

    .line 2580
    .line 2581
    mul-long/2addr v4, v7

    .line 2582
    int-to-long v7, v0

    .line 2583
    add-long/2addr v4, v7

    .line 2584
    iget-object v0, v3, Lb5/n0;->n:LK4/a;

    .line 2585
    .line 2586
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2587
    .line 2588
    .line 2589
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2590
    .line 2591
    .line 2592
    move-result-wide v7

    .line 2593
    sub-long/2addr v4, v7

    .line 2594
    const-wide/16 v7, 0x1f4

    .line 2595
    .line 2596
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 2597
    .line 2598
    .line 2599
    move-result-wide v3

    .line 2600
    cmp-long v0, v3, v7

    .line 2601
    .line 2602
    if-lez v0, :cond_55

    .line 2603
    .line 2604
    invoke-static {v6}, Lb5/n0;->f(Lb5/x0;)V

    .line 2605
    .line 2606
    .line 2607
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2608
    .line 2609
    .line 2610
    move-result-object v0

    .line 2611
    const-string v5, "Waiting to fetch trigger URIs until some time after boot. Delay in millis"

    .line 2612
    .line 2613
    move-object/from16 v6, v20

    .line 2614
    .line 2615
    invoke-virtual {v6, v0, v5}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2616
    .line 2617
    .line 2618
    :cond_55
    invoke-static {v1}, Lb5/n0;->e(Lb5/B;)V

    .line 2619
    .line 2620
    .line 2621
    invoke-virtual {v1}, Lb5/A;->l0()V

    .line 2622
    .line 2623
    .line 2624
    iget-object v0, v1, Lb5/S0;->l:Lb5/M0;

    .line 2625
    .line 2626
    if-nez v0, :cond_56

    .line 2627
    .line 2628
    new-instance v0, Lb5/M0;

    .line 2629
    .line 2630
    const/4 v5, 0x0

    .line 2631
    move-object/from16 v10, v19

    .line 2632
    .line 2633
    invoke-direct {v0, v1, v10, v5}, Lb5/M0;-><init>(Lb5/S0;Lb5/y0;I)V

    .line 2634
    .line 2635
    .line 2636
    iput-object v0, v1, Lb5/S0;->l:Lb5/M0;

    .line 2637
    .line 2638
    :cond_56
    iget-object v0, v1, Lb5/S0;->l:Lb5/M0;

    .line 2639
    .line 2640
    invoke-virtual {v0, v3, v4}, Lb5/o;->c(J)V

    .line 2641
    .line 2642
    .line 2643
    :cond_57
    iget-object v0, v2, Lb5/e0;->p:Lb5/b0;

    .line 2644
    .line 2645
    const/4 v1, 0x1

    .line 2646
    invoke-virtual {v0, v1}, Lb5/b0;->a(Z)V

    .line 2647
    .line 2648
    .line 2649
    return-void

    .line 2650
    :cond_58
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2651
    .line 2652
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2653
    .line 2654
    .line 2655
    throw v0

    .line 2656
    :cond_59
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2657
    .line 2658
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2659
    .line 2660
    .line 2661
    throw v0

    .line 2662
    :cond_5a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2663
    .line 2664
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2665
    .line 2666
    .line 2667
    throw v0

    .line 2668
    :cond_5b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2669
    .line 2670
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2671
    .line 2672
    .line 2673
    throw v0
.end method


# virtual methods
.method public final run()V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    const/4 v5, 0x4

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v8, 0x1

    .line 10
    iget v9, v1, LS5/o;->a:I

    .line 11
    .line 12
    packed-switch v9, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lb5/J1;

    .line 18
    .line 19
    invoke-virtual {v0}, Lb5/J1;->e()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lb5/J1;->K()Lb5/m0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Lb5/m0;->l0()V

    .line 27
    .line 28
    .line 29
    iget-object v2, v0, Lb5/J1;->p:Ljava/util/ArrayList;

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    new-instance v2, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v2, v0, Lb5/J1;->p:Ljava/util/ArrayList;

    .line 39
    .line 40
    :cond_0
    iget-object v2, v0, Lb5/J1;->p:Ljava/util/ArrayList;

    .line 41
    .line 42
    iget-object v3, v1, LS5/o;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Ljava/lang/Runnable;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lb5/J1;->X()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_0
    const-string v0, "FA"

    .line 54
    .line 55
    const-string v2, "[sgtm] AppMeasurementJobService processed last Scion upload request."

    .line 56
    .line 57
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lb7/c;

    .line 63
    .line 64
    iget-object v0, v0, Lb7/c;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Landroid/app/Service;

    .line 67
    .line 68
    check-cast v0, Lb5/p1;

    .line 69
    .line 70
    iget-object v2, v1, LS5/o;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Landroid/app/job/JobParameters;

    .line 73
    .line 74
    invoke-interface {v0, v2}, Lb5/p1;->m(Landroid/app/job/JobParameters;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_1
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lb5/l1;

    .line 81
    .line 82
    iget-object v0, v0, Lb5/l1;->c:Lb5/m1;

    .line 83
    .line 84
    iput-object v6, v0, Lb5/m1;->d:Lb5/G;

    .line 85
    .line 86
    iget-object v2, v0, LD/n;->a:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Lb5/n0;

    .line 89
    .line 90
    iget-object v2, v2, Lb5/n0;->g:Lb5/g;

    .line 91
    .line 92
    sget-object v3, Lb5/E;->p1:Lb5/D;

    .line 93
    .line 94
    invoke-virtual {v2, v6, v3}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    iget-object v2, v1, LS5/o;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v2, LB4/b;

    .line 103
    .line 104
    iget v2, v2, LB4/b;->b:I

    .line 105
    .line 106
    const/16 v3, 0x1e61

    .line 107
    .line 108
    if-ne v2, v3, :cond_2

    .line 109
    .line 110
    iget-object v2, v0, Lb5/m1;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 111
    .line 112
    if-nez v2, :cond_1

    .line 113
    .line 114
    invoke-static {v8}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    iput-object v2, v0, Lb5/m1;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 119
    .line 120
    :cond_1
    iget-object v0, v0, Lb5/m1;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 121
    .line 122
    new-instance v2, LA4/e;

    .line 123
    .line 124
    const/16 v3, 0xd

    .line 125
    .line 126
    invoke-direct {v2, v3, v1}, LA4/e;-><init>(ILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    sget-object v3, Lb5/E;->Z:Lb5/D;

    .line 130
    .line 131
    invoke-virtual {v3, v6}, Lb5/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Ljava/lang/Long;

    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 138
    .line 139
    .line 140
    move-result-wide v3

    .line 141
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 142
    .line 143
    invoke-interface {v0, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_2
    invoke-virtual {v0}, Lb5/m1;->A0()V

    .line 148
    .line 149
    .line 150
    :goto_0
    return-void

    .line 151
    :pswitch_2
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lb5/l1;

    .line 154
    .line 155
    iget-object v0, v0, Lb5/l1;->c:Lb5/m1;

    .line 156
    .line 157
    iget-object v2, v1, LS5/o;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v2, Landroid/content/ComponentName;

    .line 160
    .line 161
    invoke-static {v0, v2}, Lb5/m1;->E0(Lb5/m1;Landroid/content/ComponentName;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_3
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 166
    .line 167
    move-object v2, v0

    .line 168
    check-cast v2, Lb5/m1;

    .line 169
    .line 170
    iget-object v3, v2, Lb5/m1;->d:Lb5/G;

    .line 171
    .line 172
    iget-object v0, v2, LD/n;->a:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Lb5/n0;

    .line 175
    .line 176
    if-nez v3, :cond_3

    .line 177
    .line 178
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 179
    .line 180
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 181
    .line 182
    .line 183
    const-string v2, "Failed to send current screen to service"

    .line 184
    .line 185
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 186
    .line 187
    invoke-virtual {v0, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_3
    :try_start_0
    iget-object v4, v1, LS5/o;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v4, Lb5/a1;

    .line 194
    .line 195
    if-nez v4, :cond_4

    .line 196
    .line 197
    iget-object v0, v0, Lb5/n0;->a:Landroid/content/Context;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    const-wide/16 v4, 0x0

    .line 204
    .line 205
    const/4 v6, 0x0

    .line 206
    const/4 v7, 0x0

    .line 207
    invoke-interface/range {v3 .. v8}, Lb5/G;->Z0(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :catch_0
    move-exception v0

    .line 212
    goto :goto_2

    .line 213
    :cond_4
    iget-wide v5, v4, Lb5/a1;->c:J

    .line 214
    .line 215
    move-wide v7, v5

    .line 216
    iget-object v6, v4, Lb5/a1;->a:Ljava/lang/String;

    .line 217
    .line 218
    iget-object v4, v4, Lb5/a1;->b:Ljava/lang/String;

    .line 219
    .line 220
    iget-object v0, v0, Lb5/n0;->a:Landroid/content/Context;

    .line 221
    .line 222
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    move-wide/from16 v25, v7

    .line 227
    .line 228
    move-object v7, v4

    .line 229
    move-wide/from16 v4, v25

    .line 230
    .line 231
    move-object v8, v0

    .line 232
    invoke-interface/range {v3 .. v8}, Lb5/G;->Z0(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :goto_1
    invoke-virtual {v2}, Lb5/m1;->B0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :goto_2
    iget-object v2, v2, LD/n;->a:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v2, Lb5/n0;

    .line 242
    .line 243
    iget-object v2, v2, Lb5/n0;->i:Lb5/V;

    .line 244
    .line 245
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 246
    .line 247
    .line 248
    const-string v3, "Failed to send current screen to the service"

    .line 249
    .line 250
    iget-object v2, v2, Lb5/V;->f:Lb5/T;

    .line 251
    .line 252
    invoke-virtual {v2, v0, v3}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    :goto_3
    return-void

    .line 256
    :pswitch_4
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 259
    .line 260
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->e:Lb5/n0;

    .line 261
    .line 262
    iget-object v0, v0, Lb5/n0;->p:Lb5/S0;

    .line 263
    .line 264
    invoke-static {v0}, Lb5/n0;->e(Lb5/B;)V

    .line 265
    .line 266
    .line 267
    iget-object v2, v1, LS5/o;->b:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v2, LO0/c;

    .line 270
    .line 271
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Lb5/B;->m0()V

    .line 275
    .line 276
    .line 277
    iget-object v3, v0, Lb5/S0;->d:LO0/c;

    .line 278
    .line 279
    if-eq v2, v3, :cond_6

    .line 280
    .line 281
    if-nez v3, :cond_5

    .line 282
    .line 283
    move v7, v8

    .line 284
    :cond_5
    const-string v3, "EventInterceptor already set."

    .line 285
    .line 286
    invoke-static {v3, v7}, LF4/y;->j(Ljava/lang/String;Z)V

    .line 287
    .line 288
    .line 289
    :cond_6
    iput-object v2, v0, Lb5/S0;->d:LO0/c;

    .line 290
    .line 291
    return-void

    .line 292
    :pswitch_5
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, Lb5/S0;

    .line 295
    .line 296
    iget-object v2, v0, LD/n;->a:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v2, Lb5/n0;

    .line 299
    .line 300
    iget-object v3, v2, Lb5/n0;->h:Lb5/e0;

    .line 301
    .line 302
    invoke-static {v3}, Lb5/n0;->d(LD/n;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3}, LD/n;->l0()V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3}, LD/n;->l0()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    const-string v9, "dma_consent_settings"

    .line 316
    .line 317
    invoke-interface {v4, v9, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    invoke-static {v4}, Lb5/p;->b(Ljava/lang/String;)Lb5/p;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    iget-object v6, v1, LS5/o;->b:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v6, Lb5/p;

    .line 328
    .line 329
    iget v4, v4, Lb5/p;->a:I

    .line 330
    .line 331
    iget v10, v6, Lb5/p;->a:I

    .line 332
    .line 333
    invoke-static {v10, v4}, Lb5/C0;->l(II)Z

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    iget-object v2, v2, Lb5/n0;->i:Lb5/V;

    .line 338
    .line 339
    if-eqz v4, :cond_8

    .line 340
    .line 341
    invoke-virtual {v3}, Lb5/e0;->q0()Landroid/content/SharedPreferences;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    iget-object v4, v6, Lb5/p;->b:Ljava/lang/String;

    .line 350
    .line 351
    invoke-interface {v3, v9, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 352
    .line 353
    .line 354
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 355
    .line 356
    .line 357
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 358
    .line 359
    .line 360
    const-string v3, "Setting DMA consent(FE)"

    .line 361
    .line 362
    iget-object v2, v2, Lb5/V;->n:Lb5/T;

    .line 363
    .line 364
    invoke-virtual {v2, v6, v3}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, Lb5/n0;

    .line 370
    .line 371
    invoke-virtual {v0}, Lb5/n0;->m()Lb5/m1;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {v2}, Lb5/m1;->x0()Z

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    if-eqz v2, :cond_7

    .line 380
    .line 381
    invoke-virtual {v0}, Lb5/n0;->m()Lb5/m1;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0}, Lb5/B;->m0()V

    .line 389
    .line 390
    .line 391
    new-instance v2, Lb5/e1;

    .line 392
    .line 393
    invoke-direct {v2, v0, v8}, Lb5/e1;-><init>(Lb5/m1;I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, v2}, Lb5/m1;->C0(Ljava/lang/Runnable;)V

    .line 397
    .line 398
    .line 399
    goto :goto_4

    .line 400
    :cond_7
    invoke-virtual {v0}, Lb5/n0;->m()Lb5/m1;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0}, Lb5/B;->m0()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0}, Lb5/m1;->w0()Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_9

    .line 415
    .line 416
    invoke-virtual {v0, v7}, Lb5/m1;->z0(Z)Lb5/Q1;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    new-instance v3, Lb5/i1;

    .line 421
    .line 422
    invoke-direct {v3, v0, v2, v5}, Lb5/i1;-><init>(Lb5/m1;Lb5/Q1;I)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v3}, Lb5/m1;->C0(Ljava/lang/Runnable;)V

    .line 426
    .line 427
    .line 428
    goto :goto_4

    .line 429
    :cond_8
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 430
    .line 431
    .line 432
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    const-string v3, "Lower precedence consent source ignored, proposed source"

    .line 437
    .line 438
    iget-object v2, v2, Lb5/V;->l:Lb5/T;

    .line 439
    .line 440
    invoke-virtual {v2, v0, v3}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    :cond_9
    :goto_4
    return-void

    .line 444
    :pswitch_6
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v0, Lb5/S0;

    .line 447
    .line 448
    iget-object v2, v1, LS5/o;->b:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v2, Ljava/lang/Boolean;

    .line 451
    .line 452
    invoke-virtual {v0, v2, v8}, Lb5/S0;->H0(Ljava/lang/Boolean;Z)V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    :pswitch_7
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v0, Lb5/S0;

    .line 459
    .line 460
    iget-object v4, v0, LD/n;->a:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v4, Lb5/n0;

    .line 463
    .line 464
    iget-object v4, v4, Lb5/n0;->k:Lb5/t1;

    .line 465
    .line 466
    invoke-static {v4}, Lb5/n0;->e(Lb5/B;)V

    .line 467
    .line 468
    .line 469
    iget-object v4, v4, LD/n;->a:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v4, Lb5/n0;

    .line 472
    .line 473
    iget-object v5, v4, Lb5/n0;->h:Lb5/e0;

    .line 474
    .line 475
    invoke-static {v5}, Lb5/n0;->d(LD/n;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v5}, Lb5/e0;->s0()Lb5/C0;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    sget-object v7, Lb5/B0;->c:Lb5/B0;

    .line 483
    .line 484
    invoke-virtual {v5, v7}, Lb5/C0;->k(Lb5/B0;)Z

    .line 485
    .line 486
    .line 487
    move-result v5

    .line 488
    if-nez v5, :cond_b

    .line 489
    .line 490
    iget-object v2, v4, Lb5/n0;->i:Lb5/V;

    .line 491
    .line 492
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 493
    .line 494
    .line 495
    const-string v3, "Analytics storage consent denied; will not get session id"

    .line 496
    .line 497
    iget-object v2, v2, Lb5/V;->k:Lb5/T;

    .line 498
    .line 499
    invoke-virtual {v2, v3}, Lb5/T;->b(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    :cond_a
    :goto_5
    move-object v2, v6

    .line 503
    goto :goto_6

    .line 504
    :cond_b
    iget-object v5, v4, Lb5/n0;->h:Lb5/e0;

    .line 505
    .line 506
    invoke-static {v5}, Lb5/n0;->d(LD/n;)V

    .line 507
    .line 508
    .line 509
    iget-object v4, v4, Lb5/n0;->n:LK4/a;

    .line 510
    .line 511
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 515
    .line 516
    .line 517
    move-result-wide v7

    .line 518
    invoke-virtual {v5, v7, v8}, Lb5/e0;->u0(J)Z

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    if-nez v4, :cond_a

    .line 523
    .line 524
    iget-object v4, v5, Lb5/e0;->r:Lb5/c0;

    .line 525
    .line 526
    invoke-virtual {v4}, Lb5/c0;->f()J

    .line 527
    .line 528
    .line 529
    move-result-wide v7

    .line 530
    cmp-long v2, v7, v2

    .line 531
    .line 532
    if-nez v2, :cond_c

    .line 533
    .line 534
    goto :goto_5

    .line 535
    :cond_c
    invoke-virtual {v4}, Lb5/c0;->f()J

    .line 536
    .line 537
    .line 538
    move-result-wide v2

    .line 539
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    :goto_6
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 544
    .line 545
    move-object v3, v0

    .line 546
    check-cast v3, Lb5/n0;

    .line 547
    .line 548
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v0, Lcom/google/android/gms/internal/measurement/L;

    .line 551
    .line 552
    if-eqz v2, :cond_d

    .line 553
    .line 554
    iget-object v3, v3, Lb5/n0;->l:Lb5/P1;

    .line 555
    .line 556
    invoke-static {v3}, Lb5/n0;->d(LD/n;)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 560
    .line 561
    .line 562
    move-result-wide v4

    .line 563
    invoke-virtual {v3, v0, v4, v5}, Lb5/P1;->M0(Lcom/google/android/gms/internal/measurement/L;J)V

    .line 564
    .line 565
    .line 566
    goto :goto_7

    .line 567
    :cond_d
    :try_start_1
    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/measurement/L;->v0(Landroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 568
    .line 569
    .line 570
    goto :goto_7

    .line 571
    :catch_1
    move-exception v0

    .line 572
    iget-object v2, v3, Lb5/n0;->i:Lb5/V;

    .line 573
    .line 574
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 575
    .line 576
    .line 577
    const-string v3, "getSessionId failed with exception"

    .line 578
    .line 579
    iget-object v2, v2, Lb5/V;->f:Lb5/T;

    .line 580
    .line 581
    invoke-virtual {v2, v0, v3}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    :goto_7
    return-void

    .line 585
    :pswitch_8
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v0, Lb5/S0;

    .line 588
    .line 589
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 590
    .line 591
    .line 592
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 593
    .line 594
    const/16 v3, 0x1e

    .line 595
    .line 596
    if-ge v2, v3, :cond_e

    .line 597
    .line 598
    goto :goto_9

    .line 599
    :cond_e
    iget-object v2, v0, LD/n;->a:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v2, Lb5/n0;

    .line 602
    .line 603
    iget-object v2, v2, Lb5/n0;->h:Lb5/e0;

    .line 604
    .line 605
    invoke-static {v2}, Lb5/n0;->d(LD/n;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2}, Lb5/e0;->r0()Landroid/util/SparseArray;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    iget-object v3, v1, LS5/o;->c:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast v3, Ljava/util/List;

    .line 615
    .line 616
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    :cond_f
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 621
    .line 622
    .line 623
    move-result v4

    .line 624
    if-eqz v4, :cond_11

    .line 625
    .line 626
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v4

    .line 630
    check-cast v4, Lb5/x1;

    .line 631
    .line 632
    iget v5, v4, Lb5/x1;->c:I

    .line 633
    .line 634
    invoke-static {v2, v5}, LP/x0;->u(Landroid/util/SparseArray;I)Z

    .line 635
    .line 636
    .line 637
    move-result v6

    .line 638
    if-eqz v6, :cond_10

    .line 639
    .line 640
    invoke-virtual {v2, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v5

    .line 644
    check-cast v5, Ljava/lang/Long;

    .line 645
    .line 646
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 647
    .line 648
    .line 649
    move-result-wide v5

    .line 650
    iget-wide v7, v4, Lb5/x1;->b:J

    .line 651
    .line 652
    cmp-long v5, v5, v7

    .line 653
    .line 654
    if-gez v5, :cond_f

    .line 655
    .line 656
    :cond_10
    invoke-virtual {v0}, Lb5/S0;->J0()Ljava/util/PriorityQueue;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    invoke-virtual {v5, v4}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    goto :goto_8

    .line 664
    :cond_11
    invoke-virtual {v0}, Lb5/S0;->z0()V

    .line 665
    .line 666
    .line 667
    :goto_9
    return-void

    .line 668
    :pswitch_9
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast v0, Lb5/S0;

    .line 671
    .line 672
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 673
    .line 674
    check-cast v0, Lb5/n0;

    .line 675
    .line 676
    invoke-virtual {v0}, Lb5/n0;->i()Lb5/L;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    iget-object v3, v2, Lb5/L;->r:Ljava/lang/String;

    .line 681
    .line 682
    iget-object v4, v1, LS5/o;->c:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v4, Ljava/lang/String;

    .line 685
    .line 686
    if-eqz v3, :cond_12

    .line 687
    .line 688
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    move-result v3

    .line 692
    if-nez v3, :cond_12

    .line 693
    .line 694
    move v7, v8

    .line 695
    :cond_12
    iput-object v4, v2, Lb5/L;->r:Ljava/lang/String;

    .line 696
    .line 697
    if-eqz v7, :cond_13

    .line 698
    .line 699
    invoke-virtual {v0}, Lb5/n0;->i()Lb5/L;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-virtual {v0}, Lb5/L;->t0()V

    .line 704
    .line 705
    .line 706
    :cond_13
    return-void

    .line 707
    :pswitch_a
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v0, Lb5/w0;

    .line 710
    .line 711
    iget-object v2, v0, Lb5/w0;->e:Lb5/J1;

    .line 712
    .line 713
    invoke-virtual {v2}, Lb5/J1;->e()V

    .line 714
    .line 715
    .line 716
    iget-object v2, v1, LS5/o;->b:Ljava/lang/Object;

    .line 717
    .line 718
    check-cast v2, Lb5/e;

    .line 719
    .line 720
    iget-object v3, v2, Lb5/e;->c:Lb5/M1;

    .line 721
    .line 722
    invoke-virtual {v3}, Lb5/M1;->f()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v3

    .line 726
    iget-object v0, v0, Lb5/w0;->e:Lb5/J1;

    .line 727
    .line 728
    if-nez v3, :cond_14

    .line 729
    .line 730
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    iget-object v3, v2, Lb5/e;->a:Ljava/lang/String;

    .line 734
    .line 735
    invoke-static {v3}, LF4/y;->h(Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v0, v3}, Lb5/J1;->v(Ljava/lang/String;)Lb5/Q1;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    if-eqz v3, :cond_15

    .line 743
    .line 744
    invoke-virtual {v0, v2, v3}, Lb5/J1;->O(Lb5/e;Lb5/Q1;)V

    .line 745
    .line 746
    .line 747
    goto :goto_a

    .line 748
    :cond_14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    iget-object v3, v2, Lb5/e;->a:Ljava/lang/String;

    .line 752
    .line 753
    invoke-static {v3}, LF4/y;->h(Ljava/lang/Object;)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v0, v3}, Lb5/J1;->v(Ljava/lang/String;)Lb5/Q1;

    .line 757
    .line 758
    .line 759
    move-result-object v3

    .line 760
    if-eqz v3, :cond_15

    .line 761
    .line 762
    invoke-virtual {v0, v2, v3}, Lb5/J1;->U(Lb5/e;Lb5/Q1;)V

    .line 763
    .line 764
    .line 765
    :cond_15
    :goto_a
    return-void

    .line 766
    :pswitch_b
    invoke-direct {v1}, LS5/o;->c()V

    .line 767
    .line 768
    .line 769
    return-void

    .line 770
    :pswitch_c
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast v0, Lb5/f0;

    .line 773
    .line 774
    iget-object v2, v0, Lb5/f0;->b:Lb5/g0;

    .line 775
    .line 776
    iget-object v2, v2, Lb5/g0;->a:Lb5/n0;

    .line 777
    .line 778
    iget-object v3, v2, Lb5/n0;->j:Lb5/m0;

    .line 779
    .line 780
    invoke-static {v3}, Lb5/n0;->f(Lb5/x0;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v3}, Lb5/m0;->l0()V

    .line 784
    .line 785
    .line 786
    new-instance v3, Landroid/os/Bundle;

    .line 787
    .line 788
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 789
    .line 790
    .line 791
    const-string v4, "package_name"

    .line 792
    .line 793
    iget-object v0, v0, Lb5/f0;->a:Ljava/lang/String;

    .line 794
    .line 795
    invoke-virtual {v3, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 799
    .line 800
    check-cast v0, Lcom/google/android/gms/internal/measurement/B;

    .line 801
    .line 802
    :try_start_2
    check-cast v0, Lcom/google/android/gms/internal/measurement/z;

    .line 803
    .line 804
    invoke-virtual {v0}, LS4/a;->Q()Landroid/os/Parcel;

    .line 805
    .line 806
    .line 807
    move-result-object v4

    .line 808
    invoke-static {v4, v3}, Lcom/google/android/gms/internal/measurement/y;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v0, v4, v8}, LS4/a;->f1(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 816
    .line 817
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/measurement/y;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 818
    .line 819
    .line 820
    move-result-object v3

    .line 821
    check-cast v3, Landroid/os/Bundle;

    .line 822
    .line 823
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 824
    .line 825
    .line 826
    if-nez v3, :cond_16

    .line 827
    .line 828
    iget-object v0, v2, Lb5/n0;->i:Lb5/V;

    .line 829
    .line 830
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 831
    .line 832
    .line 833
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 834
    .line 835
    const-string v3, "Install Referrer Service returned a null response"

    .line 836
    .line 837
    invoke-virtual {v0, v3}, Lb5/T;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 838
    .line 839
    .line 840
    goto :goto_b

    .line 841
    :catch_2
    move-exception v0

    .line 842
    iget-object v3, v2, Lb5/n0;->i:Lb5/V;

    .line 843
    .line 844
    invoke-static {v3}, Lb5/n0;->f(Lb5/x0;)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    iget-object v3, v3, Lb5/V;->f:Lb5/T;

    .line 852
    .line 853
    const-string v4, "Exception occurred while retrieving the Install Referrer"

    .line 854
    .line 855
    invoke-virtual {v3, v0, v4}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    :cond_16
    :goto_b
    iget-object v0, v2, Lb5/n0;->j:Lb5/m0;

    .line 859
    .line 860
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v0}, Lb5/m0;->l0()V

    .line 864
    .line 865
    .line 866
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 867
    .line 868
    const-string v2, "Unexpected call on client side"

    .line 869
    .line 870
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 871
    .line 872
    .line 873
    throw v0

    .line 874
    :pswitch_d
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast v0, Lb5/y0;

    .line 877
    .line 878
    invoke-interface {v0}, Lb5/y0;->p()Lz2/a;

    .line 879
    .line 880
    .line 881
    invoke-static {}, Lz2/a;->f()Z

    .line 882
    .line 883
    .line 884
    move-result v4

    .line 885
    if-eqz v4, :cond_17

    .line 886
    .line 887
    invoke-interface {v0}, Lb5/y0;->K()Lb5/m0;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    invoke-virtual {v0, v1}, Lb5/m0;->v0(Ljava/lang/Runnable;)V

    .line 892
    .line 893
    .line 894
    goto :goto_c

    .line 895
    :cond_17
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 896
    .line 897
    check-cast v0, Lb5/o;

    .line 898
    .line 899
    iget-wide v4, v0, Lb5/o;->c:J

    .line 900
    .line 901
    cmp-long v4, v4, v2

    .line 902
    .line 903
    if-eqz v4, :cond_18

    .line 904
    .line 905
    move v7, v8

    .line 906
    :cond_18
    iput-wide v2, v0, Lb5/o;->c:J

    .line 907
    .line 908
    if-eqz v7, :cond_19

    .line 909
    .line 910
    invoke-virtual {v0}, Lb5/o;->b()V

    .line 911
    .line 912
    .line 913
    :cond_19
    :goto_c
    return-void

    .line 914
    :pswitch_e
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v0, LY7/h;

    .line 917
    .line 918
    iget-object v2, v1, LS5/o;->c:Ljava/lang/Object;

    .line 919
    .line 920
    check-cast v2, LZ7/d;

    .line 921
    .line 922
    invoke-virtual {v0, v2}, LY7/h;->B(LY7/v;)V

    .line 923
    .line 924
    .line 925
    return-void

    .line 926
    :pswitch_f
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 927
    .line 928
    check-cast v0, LY7/h;

    .line 929
    .line 930
    iget-object v2, v1, LS5/o;->b:Ljava/lang/Object;

    .line 931
    .line 932
    check-cast v2, LY7/X;

    .line 933
    .line 934
    invoke-virtual {v0, v2}, LY7/h;->B(LY7/v;)V

    .line 935
    .line 936
    .line 937
    return-void

    .line 938
    :pswitch_10
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 939
    .line 940
    check-cast v0, LM/f;

    .line 941
    .line 942
    iget-object v2, v1, LS5/o;->c:Ljava/lang/Object;

    .line 943
    .line 944
    invoke-virtual {v0, v2}, LM/f;->a(Ljava/lang/Object;)V

    .line 945
    .line 946
    .line 947
    return-void

    .line 948
    :pswitch_11
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 949
    .line 950
    check-cast v0, Lo1/f;

    .line 951
    .line 952
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v0, LG/b;

    .line 955
    .line 956
    if-eqz v0, :cond_1a

    .line 957
    .line 958
    iget-object v2, v1, LS5/o;->c:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast v2, Landroid/graphics/Typeface;

    .line 961
    .line 962
    invoke-virtual {v0, v2}, LG/b;->i(Landroid/graphics/Typeface;)V

    .line 963
    .line 964
    .line 965
    :cond_1a
    return-void

    .line 966
    :pswitch_12
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 967
    .line 968
    check-cast v0, LF0/d;

    .line 969
    .line 970
    iget-object v2, v0, LF0/d;->e:LF0/f;

    .line 971
    .line 972
    iget v3, v2, LF0/f;->g:I

    .line 973
    .line 974
    iget v6, v0, LF0/d;->c:I

    .line 975
    .line 976
    if-ne v3, v6, :cond_28

    .line 977
    .line 978
    iget-object v3, v0, LF0/d;->b:Ljava/util/List;

    .line 979
    .line 980
    iput-object v3, v2, LF0/f;->e:Ljava/util/List;

    .line 981
    .line 982
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 983
    .line 984
    .line 985
    move-result-object v3

    .line 986
    iput-object v3, v2, LF0/f;->f:Ljava/util/List;

    .line 987
    .line 988
    iget-object v3, v1, LS5/o;->b:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v3, LF0/q;

    .line 991
    .line 992
    iget-object v6, v2, LF0/f;->a:Ls4/i;

    .line 993
    .line 994
    new-instance v9, LF0/g;

    .line 995
    .line 996
    invoke-direct {v9, v6}, LF0/g;-><init>(Ls4/i;)V

    .line 997
    .line 998
    .line 999
    new-instance v6, Ljava/util/ArrayDeque;

    .line 1000
    .line 1001
    invoke-direct {v6}, Ljava/util/ArrayDeque;-><init>()V

    .line 1002
    .line 1003
    .line 1004
    iget-object v10, v3, LF0/q;->a:Ljava/util/ArrayList;

    .line 1005
    .line 1006
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1007
    .line 1008
    .line 1009
    move-result v11

    .line 1010
    sub-int/2addr v11, v8

    .line 1011
    iget v12, v3, LF0/q;->e:I

    .line 1012
    .line 1013
    iget v13, v3, LF0/q;->f:I

    .line 1014
    .line 1015
    move v14, v13

    .line 1016
    move v13, v12

    .line 1017
    :goto_d
    if-ltz v11, :cond_27

    .line 1018
    .line 1019
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v15

    .line 1023
    check-cast v15, LF0/p;

    .line 1024
    .line 1025
    move/from16 v16, v5

    .line 1026
    .line 1027
    iget v5, v15, LF0/p;->a:I

    .line 1028
    .line 1029
    iget v4, v15, LF0/p;->c:I

    .line 1030
    .line 1031
    add-int/2addr v5, v4

    .line 1032
    move/from16 v18, v8

    .line 1033
    .line 1034
    iget v8, v15, LF0/p;->b:I

    .line 1035
    .line 1036
    add-int v7, v8, v4

    .line 1037
    .line 1038
    move/from16 v20, v8

    .line 1039
    .line 1040
    :goto_e
    iget-object v8, v3, LF0/q;->b:[I

    .line 1041
    .line 1042
    move-object/from16 v21, v8

    .line 1043
    .line 1044
    iget-object v8, v3, LF0/q;->d:Lb7/c;

    .line 1045
    .line 1046
    if-le v13, v5, :cond_1f

    .line 1047
    .line 1048
    add-int/lit8 v13, v13, -0x1

    .line 1049
    .line 1050
    aget v21, v21, v13

    .line 1051
    .line 1052
    and-int/lit8 v22, v21, 0xc

    .line 1053
    .line 1054
    if-eqz v22, :cond_1d

    .line 1055
    .line 1056
    move/from16 v22, v5

    .line 1057
    .line 1058
    shr-int/lit8 v5, v21, 0x4

    .line 1059
    .line 1060
    move-object/from16 v23, v10

    .line 1061
    .line 1062
    move/from16 v24, v11

    .line 1063
    .line 1064
    const/4 v10, 0x0

    .line 1065
    invoke-static {v6, v5, v10}, LF0/q;->a(Ljava/util/ArrayDeque;IZ)LF0/r;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v11

    .line 1069
    if-eqz v11, :cond_1c

    .line 1070
    .line 1071
    iget v10, v11, LF0/r;->b:I

    .line 1072
    .line 1073
    sub-int v10, v12, v10

    .line 1074
    .line 1075
    add-int/lit8 v10, v10, -0x1

    .line 1076
    .line 1077
    invoke-virtual {v9, v13, v10}, LF0/g;->c(II)V

    .line 1078
    .line 1079
    .line 1080
    and-int/lit8 v11, v21, 0x4

    .line 1081
    .line 1082
    if-eqz v11, :cond_1b

    .line 1083
    .line 1084
    invoke-virtual {v8, v13, v5}, Lb7/c;->D(II)V

    .line 1085
    .line 1086
    .line 1087
    move/from16 v5, v18

    .line 1088
    .line 1089
    invoke-virtual {v9, v10, v5}, LF0/g;->b(II)V

    .line 1090
    .line 1091
    .line 1092
    goto :goto_10

    .line 1093
    :cond_1b
    move/from16 v5, v18

    .line 1094
    .line 1095
    goto :goto_10

    .line 1096
    :cond_1c
    move/from16 v5, v18

    .line 1097
    .line 1098
    new-instance v8, LF0/r;

    .line 1099
    .line 1100
    sub-int v10, v12, v13

    .line 1101
    .line 1102
    sub-int/2addr v10, v5

    .line 1103
    invoke-direct {v8, v13, v10, v5}, LF0/r;-><init>(IIZ)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v6, v8}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 1107
    .line 1108
    .line 1109
    goto :goto_10

    .line 1110
    :cond_1d
    move/from16 v22, v5

    .line 1111
    .line 1112
    move-object/from16 v23, v10

    .line 1113
    .line 1114
    move/from16 v24, v11

    .line 1115
    .line 1116
    move/from16 v5, v18

    .line 1117
    .line 1118
    iget v8, v9, LF0/g;->b:I

    .line 1119
    .line 1120
    const/4 v10, 0x2

    .line 1121
    if-ne v8, v10, :cond_1e

    .line 1122
    .line 1123
    iget v8, v9, LF0/g;->c:I

    .line 1124
    .line 1125
    if-lt v8, v13, :cond_1e

    .line 1126
    .line 1127
    add-int/lit8 v10, v13, 0x1

    .line 1128
    .line 1129
    if-gt v8, v10, :cond_1e

    .line 1130
    .line 1131
    iget v8, v9, LF0/g;->d:I

    .line 1132
    .line 1133
    add-int/2addr v8, v5

    .line 1134
    iput v8, v9, LF0/g;->d:I

    .line 1135
    .line 1136
    iput v13, v9, LF0/g;->c:I

    .line 1137
    .line 1138
    goto :goto_f

    .line 1139
    :cond_1e
    invoke-virtual {v9}, LF0/g;->a()V

    .line 1140
    .line 1141
    .line 1142
    iput v13, v9, LF0/g;->c:I

    .line 1143
    .line 1144
    iput v5, v9, LF0/g;->d:I

    .line 1145
    .line 1146
    const/4 v10, 0x2

    .line 1147
    iput v10, v9, LF0/g;->b:I

    .line 1148
    .line 1149
    :goto_f
    add-int/lit8 v12, v12, -0x1

    .line 1150
    .line 1151
    :goto_10
    move/from16 v5, v22

    .line 1152
    .line 1153
    move-object/from16 v10, v23

    .line 1154
    .line 1155
    move/from16 v11, v24

    .line 1156
    .line 1157
    const/16 v18, 0x1

    .line 1158
    .line 1159
    goto :goto_e

    .line 1160
    :cond_1f
    move-object/from16 v23, v10

    .line 1161
    .line 1162
    move/from16 v24, v11

    .line 1163
    .line 1164
    :goto_11
    if-le v14, v7, :cond_24

    .line 1165
    .line 1166
    add-int/lit8 v14, v14, -0x1

    .line 1167
    .line 1168
    iget-object v5, v3, LF0/q;->c:[I

    .line 1169
    .line 1170
    aget v5, v5, v14

    .line 1171
    .line 1172
    and-int/lit8 v10, v5, 0xc

    .line 1173
    .line 1174
    if-eqz v10, :cond_21

    .line 1175
    .line 1176
    shr-int/lit8 v10, v5, 0x4

    .line 1177
    .line 1178
    move-object/from16 v22, v3

    .line 1179
    .line 1180
    const/4 v11, 0x1

    .line 1181
    invoke-static {v6, v10, v11}, LF0/q;->a(Ljava/util/ArrayDeque;IZ)LF0/r;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v3

    .line 1185
    if-nez v3, :cond_20

    .line 1186
    .line 1187
    new-instance v3, LF0/r;

    .line 1188
    .line 1189
    sub-int v5, v12, v13

    .line 1190
    .line 1191
    const/4 v10, 0x0

    .line 1192
    invoke-direct {v3, v14, v5, v10}, LF0/r;-><init>(IIZ)V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v6, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 1196
    .line 1197
    .line 1198
    goto :goto_13

    .line 1199
    :cond_20
    iget v3, v3, LF0/r;->b:I

    .line 1200
    .line 1201
    sub-int v3, v12, v3

    .line 1202
    .line 1203
    sub-int/2addr v3, v11

    .line 1204
    invoke-virtual {v9, v3, v13}, LF0/g;->c(II)V

    .line 1205
    .line 1206
    .line 1207
    and-int/lit8 v3, v5, 0x4

    .line 1208
    .line 1209
    if-eqz v3, :cond_23

    .line 1210
    .line 1211
    invoke-virtual {v8, v10, v14}, Lb7/c;->D(II)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v9, v13, v11}, LF0/g;->b(II)V

    .line 1215
    .line 1216
    .line 1217
    goto :goto_13

    .line 1218
    :cond_21
    move-object/from16 v22, v3

    .line 1219
    .line 1220
    const/4 v11, 0x1

    .line 1221
    iget v3, v9, LF0/g;->b:I

    .line 1222
    .line 1223
    if-ne v3, v11, :cond_22

    .line 1224
    .line 1225
    iget v3, v9, LF0/g;->c:I

    .line 1226
    .line 1227
    if-lt v13, v3, :cond_22

    .line 1228
    .line 1229
    iget v5, v9, LF0/g;->d:I

    .line 1230
    .line 1231
    add-int v10, v3, v5

    .line 1232
    .line 1233
    if-gt v13, v10, :cond_22

    .line 1234
    .line 1235
    add-int/2addr v5, v11

    .line 1236
    iput v5, v9, LF0/g;->d:I

    .line 1237
    .line 1238
    invoke-static {v13, v3}, Ljava/lang/Math;->min(II)I

    .line 1239
    .line 1240
    .line 1241
    move-result v3

    .line 1242
    iput v3, v9, LF0/g;->c:I

    .line 1243
    .line 1244
    goto :goto_12

    .line 1245
    :cond_22
    invoke-virtual {v9}, LF0/g;->a()V

    .line 1246
    .line 1247
    .line 1248
    iput v13, v9, LF0/g;->c:I

    .line 1249
    .line 1250
    iput v11, v9, LF0/g;->d:I

    .line 1251
    .line 1252
    iput v11, v9, LF0/g;->b:I

    .line 1253
    .line 1254
    :goto_12
    add-int/2addr v12, v11

    .line 1255
    :cond_23
    :goto_13
    move-object/from16 v3, v22

    .line 1256
    .line 1257
    goto :goto_11

    .line 1258
    :cond_24
    move-object/from16 v22, v3

    .line 1259
    .line 1260
    const/4 v11, 0x1

    .line 1261
    iget v13, v15, LF0/p;->a:I

    .line 1262
    .line 1263
    move v5, v13

    .line 1264
    move/from16 v7, v20

    .line 1265
    .line 1266
    const/4 v3, 0x0

    .line 1267
    :goto_14
    if-ge v3, v4, :cond_26

    .line 1268
    .line 1269
    aget v10, v21, v5

    .line 1270
    .line 1271
    and-int/lit8 v10, v10, 0xf

    .line 1272
    .line 1273
    const/4 v14, 0x2

    .line 1274
    if-ne v10, v14, :cond_25

    .line 1275
    .line 1276
    invoke-virtual {v8, v5, v7}, Lb7/c;->D(II)V

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v9, v5, v11}, LF0/g;->b(II)V

    .line 1280
    .line 1281
    .line 1282
    :cond_25
    add-int/2addr v5, v11

    .line 1283
    add-int/2addr v7, v11

    .line 1284
    add-int/2addr v3, v11

    .line 1285
    goto :goto_14

    .line 1286
    :cond_26
    add-int/lit8 v11, v24, -0x1

    .line 1287
    .line 1288
    move/from16 v5, v16

    .line 1289
    .line 1290
    move/from16 v14, v20

    .line 1291
    .line 1292
    move-object/from16 v3, v22

    .line 1293
    .line 1294
    move-object/from16 v10, v23

    .line 1295
    .line 1296
    const/4 v7, 0x0

    .line 1297
    const/4 v8, 0x1

    .line 1298
    goto/16 :goto_d

    .line 1299
    .line 1300
    :cond_27
    invoke-virtual {v9}, LF0/g;->a()V

    .line 1301
    .line 1302
    .line 1303
    iget-object v0, v0, LF0/d;->d:Ljava/lang/Runnable;

    .line 1304
    .line 1305
    invoke-virtual {v2, v0}, LF0/f;->a(Ljava/lang/Runnable;)V

    .line 1306
    .line 1307
    .line 1308
    :cond_28
    return-void

    .line 1309
    :pswitch_13
    move/from16 v16, v5

    .line 1310
    .line 1311
    iget-object v2, v1, LS5/o;->c:Ljava/lang/Object;

    .line 1312
    .line 1313
    check-cast v2, LA3/E;

    .line 1314
    .line 1315
    iget v3, v2, LA3/E;->b:I

    .line 1316
    .line 1317
    iget-object v4, v1, LS5/o;->b:Ljava/lang/Object;

    .line 1318
    .line 1319
    check-cast v4, LD4/p;

    .line 1320
    .line 1321
    if-lez v3, :cond_2a

    .line 1322
    .line 1323
    iget-object v3, v2, LA3/E;->d:Ljava/lang/Object;

    .line 1324
    .line 1325
    check-cast v3, Landroid/os/Bundle;

    .line 1326
    .line 1327
    if-eqz v3, :cond_29

    .line 1328
    .line 1329
    const-string v5, "ConnectionlessLifecycleHelper"

    .line 1330
    .line 1331
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v6

    .line 1335
    :cond_29
    invoke-virtual {v4, v6}, LD4/p;->b(Landroid/os/Bundle;)V

    .line 1336
    .line 1337
    .line 1338
    :cond_2a
    iget v3, v2, LA3/E;->b:I

    .line 1339
    .line 1340
    const/4 v10, 0x2

    .line 1341
    if-lt v3, v10, :cond_2b

    .line 1342
    .line 1343
    const/4 v5, 0x1

    .line 1344
    iput-boolean v5, v4, LD4/p;->b:Z

    .line 1345
    .line 1346
    invoke-virtual {v4}, LD4/p;->d()V

    .line 1347
    .line 1348
    .line 1349
    :cond_2b
    iget v3, v2, LA3/E;->b:I

    .line 1350
    .line 1351
    if-lt v3, v0, :cond_2c

    .line 1352
    .line 1353
    invoke-virtual {v4}, LD4/p;->d()V

    .line 1354
    .line 1355
    .line 1356
    :cond_2c
    iget v0, v2, LA3/E;->b:I

    .line 1357
    .line 1358
    move/from16 v2, v16

    .line 1359
    .line 1360
    if-lt v0, v2, :cond_2d

    .line 1361
    .line 1362
    invoke-virtual {v4}, LD4/p;->c()V

    .line 1363
    .line 1364
    .line 1365
    :cond_2d
    return-void

    .line 1366
    :pswitch_14
    invoke-direct {v1}, LS5/o;->b()V

    .line 1367
    .line 1368
    .line 1369
    return-void

    .line 1370
    :pswitch_15
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 1371
    .line 1372
    check-cast v0, Ld5/e;

    .line 1373
    .line 1374
    iget-object v2, v0, Ld5/e;->b:LB4/b;

    .line 1375
    .line 1376
    iget v3, v2, LB4/b;->b:I

    .line 1377
    .line 1378
    if-nez v3, :cond_2e

    .line 1379
    .line 1380
    const/4 v7, 0x1

    .line 1381
    goto :goto_15

    .line 1382
    :cond_2e
    const/4 v7, 0x0

    .line 1383
    :goto_15
    iget-object v3, v1, LS5/o;->c:Ljava/lang/Object;

    .line 1384
    .line 1385
    check-cast v3, LD4/E;

    .line 1386
    .line 1387
    if-eqz v7, :cond_34

    .line 1388
    .line 1389
    iget-object v0, v0, Ld5/e;->c:LF4/r;

    .line 1390
    .line 1391
    invoke-static {v0}, LF4/y;->h(Ljava/lang/Object;)V

    .line 1392
    .line 1393
    .line 1394
    iget-object v2, v0, LF4/r;->c:LB4/b;

    .line 1395
    .line 1396
    iget v4, v2, LB4/b;->b:I

    .line 1397
    .line 1398
    if-nez v4, :cond_33

    .line 1399
    .line 1400
    iget-object v2, v3, LD4/E;->l:LD4/v;

    .line 1401
    .line 1402
    iget-object v0, v0, LF4/r;->b:Landroid/os/IBinder;

    .line 1403
    .line 1404
    if-nez v0, :cond_2f

    .line 1405
    .line 1406
    goto :goto_16

    .line 1407
    :cond_2f
    sget v4, LF4/a;->f:I

    .line 1408
    .line 1409
    const-string v4, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 1410
    .line 1411
    invoke-interface {v0, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v5

    .line 1415
    instance-of v6, v5, LF4/i;

    .line 1416
    .line 1417
    if-eqz v6, :cond_30

    .line 1418
    .line 1419
    move-object v6, v5

    .line 1420
    check-cast v6, LF4/i;

    .line 1421
    .line 1422
    goto :goto_16

    .line 1423
    :cond_30
    new-instance v6, LF4/M;

    .line 1424
    .line 1425
    const/4 v10, 0x2

    .line 1426
    invoke-direct {v6, v0, v4, v10}, LS4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 1427
    .line 1428
    .line 1429
    :goto_16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1430
    .line 1431
    .line 1432
    if-eqz v6, :cond_32

    .line 1433
    .line 1434
    iget-object v0, v3, LD4/E;->i:Ljava/util/Set;

    .line 1435
    .line 1436
    if-nez v0, :cond_31

    .line 1437
    .line 1438
    goto :goto_17

    .line 1439
    :cond_31
    iput-object v6, v2, LD4/v;->d:Ljava/lang/Object;

    .line 1440
    .line 1441
    iput-object v0, v2, LD4/v;->e:Ljava/lang/Object;

    .line 1442
    .line 1443
    iget-boolean v4, v2, LD4/v;->a:Z

    .line 1444
    .line 1445
    if-eqz v4, :cond_35

    .line 1446
    .line 1447
    iget-object v2, v2, LD4/v;->b:Ljava/lang/Object;

    .line 1448
    .line 1449
    check-cast v2, LC4/c;

    .line 1450
    .line 1451
    invoke-interface {v2, v6, v0}, LC4/c;->e(LF4/i;Ljava/util/Set;)V

    .line 1452
    .line 1453
    .line 1454
    goto :goto_18

    .line 1455
    :cond_32
    :goto_17
    new-instance v0, Ljava/lang/Exception;

    .line 1456
    .line 1457
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 1458
    .line 1459
    .line 1460
    const-string v4, "GoogleApiManager"

    .line 1461
    .line 1462
    const-string v5, "Received null response from onSignInSuccess"

    .line 1463
    .line 1464
    invoke-static {v4, v5, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1465
    .line 1466
    .line 1467
    new-instance v0, LB4/b;

    .line 1468
    .line 1469
    const/4 v4, 0x4

    .line 1470
    invoke-direct {v0, v4}, LB4/b;-><init>(I)V

    .line 1471
    .line 1472
    .line 1473
    invoke-virtual {v2, v0}, LD4/v;->d(LB4/b;)V

    .line 1474
    .line 1475
    .line 1476
    goto :goto_18

    .line 1477
    :cond_33
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v0

    .line 1481
    new-instance v4, Ljava/lang/Exception;

    .line 1482
    .line 1483
    invoke-direct {v4}, Ljava/lang/Exception;-><init>()V

    .line 1484
    .line 1485
    .line 1486
    const-string v5, "Sign-in succeeded with resolve account failure: "

    .line 1487
    .line 1488
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v0

    .line 1492
    const-string v5, "SignInCoordinator"

    .line 1493
    .line 1494
    invoke-static {v5, v0, v4}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1495
    .line 1496
    .line 1497
    iget-object v0, v3, LD4/E;->l:LD4/v;

    .line 1498
    .line 1499
    invoke-virtual {v0, v2}, LD4/v;->d(LB4/b;)V

    .line 1500
    .line 1501
    .line 1502
    iget-object v0, v3, LD4/E;->k:Ld5/a;

    .line 1503
    .line 1504
    invoke-interface {v0}, LC4/c;->l()V

    .line 1505
    .line 1506
    .line 1507
    goto :goto_19

    .line 1508
    :cond_34
    iget-object v0, v3, LD4/E;->l:LD4/v;

    .line 1509
    .line 1510
    invoke-virtual {v0, v2}, LD4/v;->d(LB4/b;)V

    .line 1511
    .line 1512
    .line 1513
    :cond_35
    :goto_18
    iget-object v0, v3, LD4/E;->k:Ld5/a;

    .line 1514
    .line 1515
    invoke-interface {v0}, LC4/c;->l()V

    .line 1516
    .line 1517
    .line 1518
    :goto_19
    return-void

    .line 1519
    :pswitch_16
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 1520
    .line 1521
    check-cast v0, LD4/v;

    .line 1522
    .line 1523
    iget-object v2, v0, LD4/v;->f:Ljava/lang/Object;

    .line 1524
    .line 1525
    check-cast v2, LD4/g;

    .line 1526
    .line 1527
    iget-object v2, v2, LD4/g;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1528
    .line 1529
    iget-object v3, v0, LD4/v;->c:Ljava/lang/Object;

    .line 1530
    .line 1531
    check-cast v3, LD4/b;

    .line 1532
    .line 1533
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v2

    .line 1537
    check-cast v2, LD4/t;

    .line 1538
    .line 1539
    if-nez v2, :cond_36

    .line 1540
    .line 1541
    goto :goto_1b

    .line 1542
    :cond_36
    iget-object v3, v1, LS5/o;->b:Ljava/lang/Object;

    .line 1543
    .line 1544
    check-cast v3, LB4/b;

    .line 1545
    .line 1546
    iget v4, v3, LB4/b;->b:I

    .line 1547
    .line 1548
    if-nez v4, :cond_37

    .line 1549
    .line 1550
    const/4 v7, 0x1

    .line 1551
    goto :goto_1a

    .line 1552
    :cond_37
    const/4 v7, 0x0

    .line 1553
    :goto_1a
    if-eqz v7, :cond_39

    .line 1554
    .line 1555
    const/4 v5, 0x1

    .line 1556
    iput-boolean v5, v0, LD4/v;->a:Z

    .line 1557
    .line 1558
    iget-object v3, v0, LD4/v;->b:Ljava/lang/Object;

    .line 1559
    .line 1560
    check-cast v3, LC4/c;

    .line 1561
    .line 1562
    invoke-interface {v3}, LC4/c;->m()Z

    .line 1563
    .line 1564
    .line 1565
    move-result v4

    .line 1566
    if-eqz v4, :cond_38

    .line 1567
    .line 1568
    iget-boolean v2, v0, LD4/v;->a:Z

    .line 1569
    .line 1570
    if-eqz v2, :cond_3a

    .line 1571
    .line 1572
    iget-object v2, v0, LD4/v;->d:Ljava/lang/Object;

    .line 1573
    .line 1574
    check-cast v2, LF4/i;

    .line 1575
    .line 1576
    if-eqz v2, :cond_3a

    .line 1577
    .line 1578
    iget-object v0, v0, LD4/v;->e:Ljava/lang/Object;

    .line 1579
    .line 1580
    check-cast v0, Ljava/util/Set;

    .line 1581
    .line 1582
    invoke-interface {v3, v2, v0}, LC4/c;->e(LF4/i;Ljava/util/Set;)V

    .line 1583
    .line 1584
    .line 1585
    goto :goto_1b

    .line 1586
    :cond_38
    :try_start_3
    invoke-interface {v3}, LC4/c;->b()Ljava/util/Set;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v0

    .line 1590
    invoke-interface {v3, v6, v0}, LC4/c;->e(LF4/i;Ljava/util/Set;)V
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_3

    .line 1591
    .line 1592
    .line 1593
    goto :goto_1b

    .line 1594
    :catch_3
    move-exception v0

    .line 1595
    const-string v4, "GoogleApiManager"

    .line 1596
    .line 1597
    const-string v5, "Failed to get service from broker. "

    .line 1598
    .line 1599
    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1600
    .line 1601
    .line 1602
    const-string v0, "Failed to get service from broker."

    .line 1603
    .line 1604
    invoke-interface {v3, v0}, LC4/c;->d(Ljava/lang/String;)V

    .line 1605
    .line 1606
    .line 1607
    new-instance v0, LB4/b;

    .line 1608
    .line 1609
    const/16 v3, 0xa

    .line 1610
    .line 1611
    invoke-direct {v0, v3}, LB4/b;-><init>(I)V

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v2, v0, v6}, LD4/t;->o(LB4/b;Ljava/lang/RuntimeException;)V

    .line 1615
    .line 1616
    .line 1617
    goto :goto_1b

    .line 1618
    :cond_39
    invoke-virtual {v2, v3, v6}, LD4/t;->o(LB4/b;Ljava/lang/RuntimeException;)V

    .line 1619
    .line 1620
    .line 1621
    :cond_3a
    :goto_1b
    return-void

    .line 1622
    :pswitch_17
    :try_start_4
    sget-object v2, LD/b;->d:Ljava/lang/reflect/Method;
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1623
    .line 1624
    iget-object v3, v1, LS5/o;->c:Ljava/lang/Object;

    .line 1625
    .line 1626
    iget-object v4, v1, LS5/o;->b:Ljava/lang/Object;

    .line 1627
    .line 1628
    if-eqz v2, :cond_3b

    .line 1629
    .line 1630
    :try_start_5
    new-array v0, v0, [Ljava/lang/Object;

    .line 1631
    .line 1632
    const/16 v19, 0x0

    .line 1633
    .line 1634
    aput-object v3, v0, v19

    .line 1635
    .line 1636
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1637
    .line 1638
    const/16 v18, 0x1

    .line 1639
    .line 1640
    aput-object v3, v0, v18

    .line 1641
    .line 1642
    const-string v3, "AppCompat recreation"

    .line 1643
    .line 1644
    const/16 v17, 0x2

    .line 1645
    .line 1646
    aput-object v3, v0, v17

    .line 1647
    .line 1648
    invoke-virtual {v2, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1649
    .line 1650
    .line 1651
    goto :goto_1e

    .line 1652
    :catchall_0
    move-exception v0

    .line 1653
    goto :goto_1c

    .line 1654
    :catch_4
    move-exception v0

    .line 1655
    goto :goto_1d

    .line 1656
    :cond_3b
    sget-object v0, LD/b;->e:Ljava/lang/reflect/Method;

    .line 1657
    .line 1658
    const/4 v10, 0x2

    .line 1659
    new-array v2, v10, [Ljava/lang/Object;

    .line 1660
    .line 1661
    const/16 v19, 0x0

    .line 1662
    .line 1663
    aput-object v3, v2, v19

    .line 1664
    .line 1665
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1666
    .line 1667
    const/16 v18, 0x1

    .line 1668
    .line 1669
    aput-object v3, v2, v18

    .line 1670
    .line 1671
    invoke-virtual {v0, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1672
    .line 1673
    .line 1674
    goto :goto_1e

    .line 1675
    :goto_1c
    const-string v2, "ActivityRecreator"

    .line 1676
    .line 1677
    const-string v3, "Exception while invoking performStopActivity"

    .line 1678
    .line 1679
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1680
    .line 1681
    .line 1682
    goto :goto_1e

    .line 1683
    :goto_1d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v2

    .line 1687
    const-class v3, Ljava/lang/RuntimeException;

    .line 1688
    .line 1689
    if-ne v2, v3, :cond_3d

    .line 1690
    .line 1691
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v2

    .line 1695
    if-eqz v2, :cond_3d

    .line 1696
    .line 1697
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v2

    .line 1701
    const-string v3, "Unable to stop"

    .line 1702
    .line 1703
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1704
    .line 1705
    .line 1706
    move-result v2

    .line 1707
    if-nez v2, :cond_3c

    .line 1708
    .line 1709
    goto :goto_1e

    .line 1710
    :cond_3c
    throw v0

    .line 1711
    :cond_3d
    :goto_1e
    return-void

    .line 1712
    :pswitch_18
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 1713
    .line 1714
    check-cast v0, Landroid/app/Application;

    .line 1715
    .line 1716
    iget-object v2, v1, LS5/o;->c:Ljava/lang/Object;

    .line 1717
    .line 1718
    check-cast v2, LD/a;

    .line 1719
    .line 1720
    invoke-virtual {v0, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1721
    .line 1722
    .line 1723
    return-void

    .line 1724
    :pswitch_19
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 1725
    .line 1726
    check-cast v0, LD/a;

    .line 1727
    .line 1728
    iget-object v2, v1, LS5/o;->c:Ljava/lang/Object;

    .line 1729
    .line 1730
    iput-object v2, v0, LD/a;->a:Ljava/lang/Object;

    .line 1731
    .line 1732
    return-void

    .line 1733
    :pswitch_1a
    invoke-direct {v1}, LS5/o;->a()V

    .line 1734
    .line 1735
    .line 1736
    return-void

    .line 1737
    :pswitch_1b
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 1738
    .line 1739
    move-object v2, v0

    .line 1740
    check-cast v2, LA4/n;

    .line 1741
    .line 1742
    iget-object v0, v1, LS5/o;->c:Ljava/lang/Object;

    .line 1743
    .line 1744
    check-cast v0, Landroid/os/IBinder;

    .line 1745
    .line 1746
    monitor-enter v2

    .line 1747
    if-nez v0, :cond_3e

    .line 1748
    .line 1749
    :try_start_6
    const-string v0, "Null service connection"

    .line 1750
    .line 1751
    invoke-virtual {v2, v0}, LA4/n;->a(Ljava/lang/String;)V

    .line 1752
    .line 1753
    .line 1754
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 1755
    goto :goto_1f

    .line 1756
    :catchall_1
    move-exception v0

    .line 1757
    goto :goto_20

    .line 1758
    :cond_3e
    :try_start_7
    new-instance v3, LA1/g;

    .line 1759
    .line 1760
    invoke-direct {v3, v0}, LA1/g;-><init>(Landroid/os/IBinder;)V

    .line 1761
    .line 1762
    .line 1763
    iput-object v3, v2, LA4/n;->c:LA1/g;
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 1764
    .line 1765
    const/4 v10, 0x2

    .line 1766
    :try_start_8
    iput v10, v2, LA4/n;->a:I

    .line 1767
    .line 1768
    iget-object v0, v2, LA4/n;->f:LA4/q;

    .line 1769
    .line 1770
    iget-object v0, v0, LA4/q;->c:Ljava/lang/Object;

    .line 1771
    .line 1772
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 1773
    .line 1774
    new-instance v3, LA4/l;

    .line 1775
    .line 1776
    const/4 v10, 0x0

    .line 1777
    invoke-direct {v3, v2, v10}, LA4/l;-><init>(LA4/n;I)V

    .line 1778
    .line 1779
    .line 1780
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1781
    .line 1782
    .line 1783
    monitor-exit v2

    .line 1784
    goto :goto_1f

    .line 1785
    :catch_5
    move-exception v0

    .line 1786
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v0

    .line 1790
    invoke-virtual {v2, v0}, LA4/n;->a(Ljava/lang/String;)V

    .line 1791
    .line 1792
    .line 1793
    monitor-exit v2

    .line 1794
    :goto_1f
    return-void

    .line 1795
    :goto_20
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 1796
    throw v0

    .line 1797
    :pswitch_1c
    iget-object v0, v1, LS5/o;->b:Ljava/lang/Object;

    .line 1798
    .line 1799
    check-cast v0, LS5/p;

    .line 1800
    .line 1801
    instance-of v2, v0, LT5/a;

    .line 1802
    .line 1803
    iget-object v3, v1, LS5/o;->c:Ljava/lang/Object;

    .line 1804
    .line 1805
    check-cast v3, LO0/c;

    .line 1806
    .line 1807
    if-eqz v2, :cond_40

    .line 1808
    .line 1809
    move-object v2, v0

    .line 1810
    check-cast v2, LT5/a;

    .line 1811
    .line 1812
    check-cast v2, LS5/n;

    .line 1813
    .line 1814
    instance-of v4, v2, LS5/g;

    .line 1815
    .line 1816
    if-eqz v4, :cond_3f

    .line 1817
    .line 1818
    iget-object v2, v2, LS5/n;->a:Ljava/lang/Object;

    .line 1819
    .line 1820
    instance-of v4, v2, LS5/c;

    .line 1821
    .line 1822
    if-eqz v4, :cond_3f

    .line 1823
    .line 1824
    check-cast v2, LS5/c;

    .line 1825
    .line 1826
    iget-object v6, v2, LS5/c;->a:Ljava/lang/Throwable;

    .line 1827
    .line 1828
    :cond_3f
    if-eqz v6, :cond_40

    .line 1829
    .line 1830
    invoke-virtual {v3, v6}, LO0/c;->H(Ljava/lang/Throwable;)V

    .line 1831
    .line 1832
    .line 1833
    goto :goto_22

    .line 1834
    :cond_40
    :try_start_9
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/D1;->s(LS5/p;)V
    :try_end_9
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_9 .. :try_end_9} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_6

    .line 1835
    .line 1836
    .line 1837
    iget-object v0, v3, LO0/c;->c:Ljava/lang/Object;

    .line 1838
    .line 1839
    check-cast v0, Lb5/S0;

    .line 1840
    .line 1841
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 1842
    .line 1843
    .line 1844
    invoke-virtual {v3}, LO0/c;->S()V

    .line 1845
    .line 1846
    .line 1847
    const/4 v10, 0x0

    .line 1848
    iput-boolean v10, v0, Lb5/S0;->i:Z

    .line 1849
    .line 1850
    const/4 v5, 0x1

    .line 1851
    iput v5, v0, Lb5/S0;->j:I

    .line 1852
    .line 1853
    iget-object v2, v0, LD/n;->a:Ljava/lang/Object;

    .line 1854
    .line 1855
    check-cast v2, Lb5/n0;

    .line 1856
    .line 1857
    iget-object v2, v2, Lb5/n0;->i:Lb5/V;

    .line 1858
    .line 1859
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 1860
    .line 1861
    .line 1862
    iget-object v3, v3, LO0/c;->b:Ljava/lang/Object;

    .line 1863
    .line 1864
    check-cast v3, Lb5/x1;

    .line 1865
    .line 1866
    iget-object v3, v3, Lb5/x1;->a:Ljava/lang/String;

    .line 1867
    .line 1868
    iget-object v2, v2, Lb5/V;->m:Lb5/T;

    .line 1869
    .line 1870
    const-string v4, "Successfully registered trigger URI"

    .line 1871
    .line 1872
    invoke-virtual {v2, v3, v4}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1873
    .line 1874
    .line 1875
    invoke-virtual {v0}, Lb5/S0;->z0()V

    .line 1876
    .line 1877
    .line 1878
    goto :goto_22

    .line 1879
    :catch_6
    move-exception v0

    .line 1880
    goto :goto_21

    .line 1881
    :catch_7
    move-exception v0

    .line 1882
    :goto_21
    invoke-virtual {v3, v0}, LO0/c;->H(Ljava/lang/Throwable;)V

    .line 1883
    .line 1884
    .line 1885
    goto :goto_22

    .line 1886
    :catch_8
    move-exception v0

    .line 1887
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v0

    .line 1891
    invoke-virtual {v3, v0}, LO0/c;->H(Ljava/lang/Throwable;)V

    .line 1892
    .line 1893
    .line 1894
    :goto_22
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
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
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, LS5/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Landroid/support/v4/media/session/y;

    .line 12
    .line 13
    const-class v1, LS5/o;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/16 v2, 0xb

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, Landroid/support/v4/media/session/y;-><init>(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, LO0/c;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v1, v2, v3}, LO0/c;-><init>(IZ)V

    .line 29
    .line 30
    .line 31
    iget-object v2, v0, Landroid/support/v4/media/session/y;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, LO0/c;

    .line 34
    .line 35
    iput-object v1, v2, LO0/c;->c:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v1, v0, Landroid/support/v4/media/session/y;->d:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v2, p0, LS5/o;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, LO0/c;

    .line 42
    .line 43
    iput-object v2, v1, LO0/c;->b:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/support/v4/media/session/y;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
