.class public final Lp/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnHoverListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# static fields
.field public static k:Lp/b1;

.field public static l:Lp/b1;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Ljava/lang/CharSequence;

.field public final c:I

.field public final d:Lp/a1;

.field public final e:Lp/a1;

.field public f:I

.field public g:I

.field public h:Lp/c1;

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp/a1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lp/a1;-><init>(Lp/b1;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lp/b1;->d:Lp/a1;

    .line 11
    .line 12
    new-instance v0, Lp/a1;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, Lp/a1;-><init>(Lp/b1;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lp/b1;->e:Lp/a1;

    .line 19
    .line 20
    iput-object p1, p0, Lp/b1;->a:Landroid/view/View;

    .line 21
    .line 22
    iput-object p2, p0, Lp/b1;->b:Ljava/lang/CharSequence;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    sget-object v0, LP/S;->a:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 v2, 0x1c

    .line 37
    .line 38
    if-lt v0, v2, :cond_0

    .line 39
    .line 40
    invoke-static {p2}, LF/a;->k(Landroid/view/ViewConfiguration;)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    div-int/lit8 p2, p2, 0x2

    .line 50
    .line 51
    :goto_0
    iput p2, p0, Lp/b1;->c:I

    .line 52
    .line 53
    iput-boolean v1, p0, Lp/b1;->j:Z

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    .line 59
    .line 60
    .line 61
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
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
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
.end method

.method public static b(Lp/b1;)V
    .locals 3

    .line 1
    sget-object v0, Lp/b1;->k:Lp/b1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lp/b1;->d:Lp/a1;

    .line 6
    .line 7
    iget-object v0, v0, Lp/b1;->a:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    sput-object p0, Lp/b1;->k:Lp/b1;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lp/b1;->d:Lp/a1;

    .line 17
    .line 18
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-long v1, v1

    .line 23
    iget-object p0, p0, Lp/b1;->a:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
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
    .locals 5

    .line 1
    sget-object v0, Lp/b1;->l:Lp/b1;

    .line 2
    .line 3
    iget-object v1, p0, Lp/b1;->a:Landroid/view/View;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, p0, :cond_2

    .line 7
    .line 8
    sput-object v2, Lp/b1;->l:Lp/b1;

    .line 9
    .line 10
    iget-object v0, p0, Lp/b1;->h:Lp/c1;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, Lp/c1;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, Lp/c1;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroid/content/Context;

    .line 27
    .line 28
    const-string v4, "window"

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/view/WindowManager;

    .line 35
    .line 36
    invoke-interface {v0, v3}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iput-object v2, p0, Lp/b1;->h:Lp/c1;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Lp/b1;->j:Z

    .line 43
    .line 44
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-string v0, "TooltipCompatHandler"

    .line 49
    .line 50
    const-string v3, "sActiveHandler.mPopup == null"

    .line 51
    .line 52
    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    sget-object v0, Lp/b1;->k:Lp/b1;

    .line 56
    .line 57
    if-ne v0, p0, :cond_3

    .line 58
    .line 59
    invoke-static {v2}, Lp/b1;->b(Lp/b1;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    iget-object v0, p0, Lp/b1;->e:Lp/a1;

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    return-void
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

.method public final c(Z)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, v0, Lp/b1;->a:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {v3}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {v2}, Lp/b1;->b(Lp/b1;)V

    .line 15
    .line 16
    .line 17
    sget-object v4, Lp/b1;->l:Lp/b1;

    .line 18
    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    invoke-virtual {v4}, Lp/b1;->a()V

    .line 22
    .line 23
    .line 24
    :cond_1
    sput-object v0, Lp/b1;->l:Lp/b1;

    .line 25
    .line 26
    move/from16 v4, p1

    .line 27
    .line 28
    iput-boolean v4, v0, Lp/b1;->i:Z

    .line 29
    .line 30
    new-instance v4, Lp/c1;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v6, Landroid/view/WindowManager$LayoutParams;

    .line 40
    .line 41
    invoke-direct {v6}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v6, v4, Lp/c1;->d:Ljava/lang/Object;

    .line 45
    .line 46
    new-instance v7, Landroid/graphics/Rect;

    .line 47
    .line 48
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v7, v4, Lp/c1;->e:Ljava/lang/Object;

    .line 52
    .line 53
    new-array v7, v1, [I

    .line 54
    .line 55
    iput-object v7, v4, Lp/c1;->f:Ljava/lang/Object;

    .line 56
    .line 57
    new-array v7, v1, [I

    .line 58
    .line 59
    iput-object v7, v4, Lp/c1;->g:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v5, v4, Lp/c1;->a:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    const v8, 0x7f0d001b

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7, v8, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iput-object v2, v4, Lp/c1;->b:Ljava/lang/Object;

    .line 75
    .line 76
    const v7, 0x7f0a0246

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Landroid/widget/TextView;

    .line 84
    .line 85
    iput-object v2, v4, Lp/c1;->c:Ljava/lang/Object;

    .line 86
    .line 87
    const-class v2, Lp/c1;

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v6, v2}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iput-object v2, v6, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 101
    .line 102
    const/16 v2, 0x3ea

    .line 103
    .line 104
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 105
    .line 106
    const/4 v2, -0x2

    .line 107
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 108
    .line 109
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 110
    .line 111
    const/4 v2, -0x3

    .line 112
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 113
    .line 114
    const v2, 0x7f150004

    .line 115
    .line 116
    .line 117
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 118
    .line 119
    const/16 v2, 0x18

    .line 120
    .line 121
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 122
    .line 123
    iput-object v4, v0, Lp/b1;->h:Lp/c1;

    .line 124
    .line 125
    iget v2, v0, Lp/b1;->f:I

    .line 126
    .line 127
    iget v5, v0, Lp/b1;->g:I

    .line 128
    .line 129
    iget-boolean v6, v0, Lp/b1;->i:Z

    .line 130
    .line 131
    iget-object v7, v4, Lp/c1;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v7, Landroid/view/View;

    .line 134
    .line 135
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    const-string v9, "window"

    .line 140
    .line 141
    iget-object v10, v4, Lp/c1;->a:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v10, Landroid/content/Context;

    .line 144
    .line 145
    if-eqz v8, :cond_2

    .line 146
    .line 147
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    if-eqz v8, :cond_2

    .line 152
    .line 153
    invoke-virtual {v10, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    check-cast v8, Landroid/view/WindowManager;

    .line 158
    .line 159
    invoke-interface {v8, v7}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 160
    .line 161
    .line 162
    :cond_2
    iget-object v8, v4, Lp/c1;->c:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v8, Landroid/widget/TextView;

    .line 165
    .line 166
    iget-object v11, v0, Lp/b1;->b:Ljava/lang/CharSequence;

    .line 167
    .line 168
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    iget-object v8, v4, Lp/c1;->d:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v8, Landroid/view/WindowManager$LayoutParams;

    .line 174
    .line 175
    invoke-virtual {v3}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    iput-object v11, v8, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 180
    .line 181
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    const v12, 0x7f07053b

    .line 186
    .line 187
    .line 188
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    if-lt v12, v11, :cond_3

    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    div-int/2addr v2, v1

    .line 204
    :goto_0
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    if-lt v12, v11, :cond_4

    .line 209
    .line 210
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    const v12, 0x7f07053a

    .line 215
    .line 216
    .line 217
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    add-int v12, v5, v11

    .line 222
    .line 223
    sub-int/2addr v5, v11

    .line 224
    goto :goto_1

    .line 225
    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    const/4 v5, 0x0

    .line 230
    :goto_1
    const/16 v11, 0x31

    .line 231
    .line 232
    iput v11, v8, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 233
    .line 234
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    if-eqz v6, :cond_5

    .line 239
    .line 240
    const v14, 0x7f07053e

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_5
    const v14, 0x7f07053d

    .line 245
    .line 246
    .line 247
    :goto_2
    invoke-virtual {v11, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v14

    .line 255
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 256
    .line 257
    .line 258
    move-result-object v15

    .line 259
    instance-of v13, v15, Landroid/view/WindowManager$LayoutParams;

    .line 260
    .line 261
    if-eqz v13, :cond_6

    .line 262
    .line 263
    check-cast v15, Landroid/view/WindowManager$LayoutParams;

    .line 264
    .line 265
    iget v13, v15, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 266
    .line 267
    if-ne v13, v1, :cond_6

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 271
    .line 272
    .line 273
    move-result-object v13

    .line 274
    :goto_3
    instance-of v15, v13, Landroid/content/ContextWrapper;

    .line 275
    .line 276
    if-eqz v15, :cond_8

    .line 277
    .line 278
    instance-of v15, v13, Landroid/app/Activity;

    .line 279
    .line 280
    if-eqz v15, :cond_7

    .line 281
    .line 282
    check-cast v13, Landroid/app/Activity;

    .line 283
    .line 284
    invoke-virtual {v13}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 285
    .line 286
    .line 287
    move-result-object v13

    .line 288
    invoke-virtual {v13}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 289
    .line 290
    .line 291
    move-result-object v14

    .line 292
    goto :goto_4

    .line 293
    :cond_7
    check-cast v13, Landroid/content/ContextWrapper;

    .line 294
    .line 295
    invoke-virtual {v13}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    goto :goto_3

    .line 300
    :cond_8
    :goto_4
    if-nez v14, :cond_9

    .line 301
    .line 302
    const-string v1, "TooltipPopup"

    .line 303
    .line 304
    const-string v2, "Cannot find app view"

    .line 305
    .line 306
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    const/16 v17, 0x1

    .line 310
    .line 311
    goto/16 :goto_7

    .line 312
    .line 313
    :cond_9
    iget-object v15, v4, Lp/c1;->e:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v15, Landroid/graphics/Rect;

    .line 316
    .line 317
    invoke-virtual {v14, v15}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 318
    .line 319
    .line 320
    move/from16 v16, v1

    .line 321
    .line 322
    iget v1, v15, Landroid/graphics/Rect;->left:I

    .line 323
    .line 324
    if-gez v1, :cond_b

    .line 325
    .line 326
    iget v1, v15, Landroid/graphics/Rect;->top:I

    .line 327
    .line 328
    if-gez v1, :cond_b

    .line 329
    .line 330
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    const/16 v17, 0x1

    .line 335
    .line 336
    const-string v13, "dimen"

    .line 337
    .line 338
    move/from16 v18, v2

    .line 339
    .line 340
    const-string v2, "android"

    .line 341
    .line 342
    move/from16 v19, v5

    .line 343
    .line 344
    const-string v5, "status_bar_height"

    .line 345
    .line 346
    invoke-virtual {v1, v5, v13, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    if-eqz v2, :cond_a

    .line 351
    .line 352
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    goto :goto_5

    .line 357
    :cond_a
    const/4 v2, 0x0

    .line 358
    :goto_5
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    iget v5, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 363
    .line 364
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 365
    .line 366
    const/4 v13, 0x0

    .line 367
    invoke-virtual {v15, v13, v2, v5, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 368
    .line 369
    .line 370
    goto :goto_6

    .line 371
    :cond_b
    move/from16 v18, v2

    .line 372
    .line 373
    move/from16 v19, v5

    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    const/16 v17, 0x1

    .line 377
    .line 378
    :goto_6
    iget-object v1, v4, Lp/c1;->g:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v1, [I

    .line 381
    .line 382
    invoke-virtual {v14, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 383
    .line 384
    .line 385
    iget-object v2, v4, Lp/c1;->f:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v2, [I

    .line 388
    .line 389
    invoke-virtual {v3, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 390
    .line 391
    .line 392
    aget v4, v2, v13

    .line 393
    .line 394
    aget v5, v1, v13

    .line 395
    .line 396
    sub-int/2addr v4, v5

    .line 397
    aput v4, v2, v13

    .line 398
    .line 399
    aget v5, v2, v17

    .line 400
    .line 401
    aget v1, v1, v17

    .line 402
    .line 403
    sub-int/2addr v5, v1

    .line 404
    aput v5, v2, v17

    .line 405
    .line 406
    add-int v4, v4, v18

    .line 407
    .line 408
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    div-int/lit8 v1, v1, 0x2

    .line 413
    .line 414
    sub-int/2addr v4, v1

    .line 415
    iput v4, v8, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 416
    .line 417
    invoke-static {v13, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    invoke-virtual {v7, v1, v1}, Landroid/view/View;->measure(II)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    aget v2, v2, v17

    .line 429
    .line 430
    add-int v5, v2, v19

    .line 431
    .line 432
    sub-int/2addr v5, v11

    .line 433
    sub-int/2addr v5, v1

    .line 434
    add-int/2addr v2, v12

    .line 435
    add-int/2addr v2, v11

    .line 436
    if-eqz v6, :cond_d

    .line 437
    .line 438
    if-ltz v5, :cond_c

    .line 439
    .line 440
    iput v5, v8, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 441
    .line 442
    goto :goto_7

    .line 443
    :cond_c
    iput v2, v8, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 444
    .line 445
    goto :goto_7

    .line 446
    :cond_d
    add-int/2addr v1, v2

    .line 447
    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    if-gt v1, v4, :cond_e

    .line 452
    .line 453
    iput v2, v8, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 454
    .line 455
    goto :goto_7

    .line 456
    :cond_e
    iput v5, v8, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 457
    .line 458
    :goto_7
    invoke-virtual {v10, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    check-cast v1, Landroid/view/WindowManager;

    .line 463
    .line 464
    invoke-interface {v1, v7, v8}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v3, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 468
    .line 469
    .line 470
    iget-boolean v1, v0, Lp/b1;->i:Z

    .line 471
    .line 472
    if-eqz v1, :cond_f

    .line 473
    .line 474
    const-wide/16 v1, 0x9c4

    .line 475
    .line 476
    goto :goto_9

    .line 477
    :cond_f
    sget-object v1, LP/Q;->a:Ljava/util/WeakHashMap;

    .line 478
    .line 479
    invoke-virtual {v3}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    and-int/lit8 v1, v1, 0x1

    .line 484
    .line 485
    move/from16 v2, v17

    .line 486
    .line 487
    if-ne v1, v2, :cond_10

    .line 488
    .line 489
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    int-to-long v1, v1

    .line 494
    const-wide/16 v4, 0xbb8

    .line 495
    .line 496
    :goto_8
    sub-long v1, v4, v1

    .line 497
    .line 498
    goto :goto_9

    .line 499
    :cond_10
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    int-to-long v1, v1

    .line 504
    const-wide/16 v4, 0x3a98

    .line 505
    .line 506
    goto :goto_8

    .line 507
    :goto_9
    iget-object v4, v0, Lp/b1;->e:Lp/a1;

    .line 508
    .line 509
    invoke-virtual {v3, v4}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3, v4, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 513
    .line 514
    .line 515
    return-void
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
.end method

.method public final onHover(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object p1, p0, Lp/b1;->h:Lp/c1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-boolean p1, p0, Lp/b1;->i:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lp/b1;->a:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "accessibility"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x7

    .line 43
    if-eq v1, v2, :cond_3

    .line 44
    .line 45
    const/16 p1, 0xa

    .line 46
    .line 47
    if-eq v1, p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, Lp/b1;->j:Z

    .line 52
    .line 53
    invoke-virtual {p0}, Lp/b1;->a()V

    .line 54
    .line 55
    .line 56
    return v0

    .line 57
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    iget-object p1, p0, Lp/b1;->h:Lp/c1;

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    float-to-int p1, p1

    .line 72
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    float-to-int p2, p2

    .line 77
    iget-boolean v1, p0, Lp/b1;->j:Z

    .line 78
    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    iget v1, p0, Lp/b1;->f:I

    .line 82
    .line 83
    sub-int v1, p1, v1

    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    iget v2, p0, Lp/b1;->c:I

    .line 90
    .line 91
    if-gt v1, v2, :cond_4

    .line 92
    .line 93
    iget v1, p0, Lp/b1;->g:I

    .line 94
    .line 95
    sub-int v1, p2, v1

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-le v1, v2, :cond_5

    .line 102
    .line 103
    :cond_4
    iput p1, p0, Lp/b1;->f:I

    .line 104
    .line 105
    iput p2, p0, Lp/b1;->g:I

    .line 106
    .line 107
    iput-boolean v0, p0, Lp/b1;->j:Z

    .line 108
    .line 109
    invoke-static {p0}, Lp/b1;->b(Lp/b1;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    :goto_0
    return v0
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
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
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    iput v0, p0, Lp/b1;->f:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    div-int/lit8 p1, p1, 0x2

    .line 14
    .line 15
    iput p1, p0, Lp/b1;->g:I

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lp/b1;->c(Z)V

    .line 19
    .line 20
    .line 21
    return p1
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

.method public final onViewAttachedToWindow(Landroid/view/View;)V
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lp/b1;->a()V

    .line 2
    .line 3
    .line 4
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
