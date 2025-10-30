.class public final Lo2/l;
.super Li0/n;
.source "SourceFile"


# static fields
.field public static final M0:Ljava/lang/String;


# instance fields
.field public L0:LJ1/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lo2/l;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lkotlin/jvm/internal/d;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lo2/l;->M0:Ljava/lang/String;

    .line 12
    .line 13
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Li0/n;-><init>()V

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
.end method


# virtual methods
.method public final G(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    const-string v2, "inflater"

    .line 5
    .line 6
    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sget v2, LJ1/o0;->y:I

    .line 10
    .line 11
    const v2, 0x7f0d005c

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v2, p2, v0}, LW/c;->b(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)LW/g;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, LJ1/o0;

    .line 19
    .line 20
    iput-object p1, p0, Lo2/l;->L0:LJ1/o0;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Li0/n;->i0(Z)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lo2/l;->L0:LJ1/o0;

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    const-string v2, "binding"

    .line 29
    .line 30
    if-eqz p1, :cond_5

    .line 31
    .line 32
    new-instance v3, LK5/a;

    .line 33
    .line 34
    const/16 v4, 0x11

    .line 35
    .line 36
    invoke-direct {v3, v4, p0}, LK5/a;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, LJ1/o0;->v:Lcom/google/android/material/button/MaterialButton;

    .line 40
    .line 41
    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    .line 43
    .line 44
    new-array p1, v1, [B

    .line 45
    .line 46
    fill-array-data p1, :array_0

    .line 47
    .line 48
    .line 49
    iget-object v3, p0, Lo2/l;->L0:LJ1/o0;

    .line 50
    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    new-instance v4, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    move v5, v0

    .line 59
    :goto_0
    if-ge v5, v1, :cond_0

    .line 60
    .line 61
    aget-byte v6, p1, v5

    .line 62
    .line 63
    xor-int/lit8 v6, v6, 0x57

    .line 64
    .line 65
    int-to-char v6, v6

    .line 66
    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 v5, v5, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/4 v8, 0x0

    .line 77
    const-string v5, ""

    .line 78
    .line 79
    const/16 v9, 0x3e

    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v7, 0x0

    .line 83
    invoke-static/range {v4 .. v9}, LB7/k;->u0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LO7/l;I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget-object v1, v3, LJ1/o0;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 88
    .line 89
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    const/16 p1, 0x44

    .line 93
    .line 94
    new-array p1, p1, [B

    .line 95
    .line 96
    fill-array-data p1, :array_1

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lo2/l;->L0:LJ1/o0;

    .line 100
    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    new-instance v3, Ljava/util/ArrayList;

    .line 104
    .line 105
    const/16 v4, 0x44

    .line 106
    .line 107
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    :goto_1
    if-ge v0, v4, :cond_1

    .line 111
    .line 112
    aget-byte v5, p1, v0

    .line 113
    .line 114
    xor-int/lit8 v5, v5, 0x54

    .line 115
    .line 116
    int-to-char v5, v5

    .line 117
    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    add-int/lit8 v0, v0, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    const/4 v6, 0x0

    .line 128
    const/4 v7, 0x0

    .line 129
    const-string v4, ""

    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    const/16 v8, 0x3e

    .line 133
    .line 134
    invoke-static/range {v3 .. v8}, LB7/k;->u0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LO7/l;I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iget-object v0, v1, LJ1/o0;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 139
    .line 140
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lo2/l;->L0:LJ1/o0;

    .line 144
    .line 145
    if-eqz p1, :cond_2

    .line 146
    .line 147
    iget-object p1, p1, LW/g;->k:Landroid/view/View;

    .line 148
    .line 149
    return-object p1

    .line 150
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p2

    .line 154
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p2

    .line 158
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p2

    .line 162
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p2

    .line 166
    nop

    .line 167
    :array_0
    .array-data 1
        0x16t
        0x33t
        0x15t
        0x3bt
        0x38t
        0x34t
        0x3ct
        0x77t
        0x33t
        0x32t
        0x23t
        0x32t
        0x34t
        0x23t
        0x32t
        0x33t
    .end array-data

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
    :array_1
    .array-data 1
        0x15t
        0x30t
        0x16t
        0x38t
        0x3bt
        0x37t
        0x3ft
        0x31t
        0x26t
        0x74t
        0x3bt
        0x26t
        0x74t
        0x37t
        0x21t
        0x27t
        0x20t
        0x3bt
        0x39t
        0x74t
        0x10t
        0x1at
        0x7t
        0x74t
        0x30t
        0x31t
        0x20t
        0x31t
        0x37t
        0x20t
        0x31t
        0x30t
        0x7at
        0x74t
        0x0t
        0x3ct
        0x3dt
        0x27t
        0x74t
        0x39t
        0x35t
        0x2dt
        0x74t
        0x35t
        0x32t
        0x32t
        0x31t
        0x37t
        0x20t
        0x74t
        0x35t
        0x24t
        0x24t
        0x74t
        0x32t
        0x21t
        0x3at
        0x37t
        0x20t
        0x3dt
        0x3bt
        0x3at
        0x35t
        0x38t
        0x3dt
        0x20t
        0x2dt
        0x7at
    .end array-data
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

.method public final S(Landroid/view/View;)V
    .locals 2

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Li0/n;->G0:Landroid/app/Dialog;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v1, 0x7f060055

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, -0x1

    .line 40
    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setLayout(II)V

    .line 41
    .line 42
    .line 43
    :cond_0
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

.method public final g0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 1
    invoke-super {p0, p1}, Li0/n;->g0(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lo2/k;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 18
    .line 19
    .line 20
    return-object p1
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

.method public final k0(Li0/M;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0, p1, p2}, Li0/n;->k0(Li0/M;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    invoke-static {}, Lu6/b;->a()Lu6/b;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Lu6/b;->b(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :try_start_1
    new-instance v0, Li0/a;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Li0/a;-><init>(Li0/M;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, p1, p0, p2, v1}, Li0/a;->g(ILi0/v;Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Li0/a;->e(Z)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_1
    move-exception p1

    .line 28
    invoke-static {}, Lu6/b;->a()Lu6/b;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p2, p1}, Lu6/b;->b(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void
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
.end method
