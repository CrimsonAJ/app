.class public final Ld/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li0/y;


# direct methods
.method public synthetic constructor <init>(Li0/y;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld/g;->a:I

    iput-object p1, p0, Ld/g;->b:Li0/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Landroidx/lifecycle/w;Landroidx/lifecycle/o;)V
    .locals 1

    .line 1
    iget p1, p0, Ld/g;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ld/g;->b:Li0/y;

    .line 7
    .line 8
    iget-object p2, p1, Ld/l;->f:Landroidx/lifecycle/j0;

    .line 9
    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, Ld/j;

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    iget-object p2, p2, Ld/j;->a:Landroidx/lifecycle/j0;

    .line 21
    .line 22
    iput-object p2, p1, Ld/l;->f:Landroidx/lifecycle/j0;

    .line 23
    .line 24
    :cond_0
    iget-object p2, p1, Ld/l;->f:Landroidx/lifecycle/j0;

    .line 25
    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    new-instance p2, Landroidx/lifecycle/j0;

    .line 29
    .line 30
    invoke-direct {p2}, Landroidx/lifecycle/j0;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p2, p1, Ld/l;->f:Landroidx/lifecycle/j0;

    .line 34
    .line 35
    :cond_1
    iget-object p1, p1, Ld/l;->d:Landroidx/lifecycle/y;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Landroidx/lifecycle/y;->g0(Landroidx/lifecycle/v;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    sget-object p1, Landroidx/lifecycle/o;->ON_DESTROY:Landroidx/lifecycle/o;

    .line 42
    .line 43
    if-ne p2, p1, :cond_3

    .line 44
    .line 45
    iget-object p1, p0, Ld/g;->b:Li0/y;

    .line 46
    .line 47
    iget-object p1, p1, Ld/l;->b:LB4/i;

    .line 48
    .line 49
    const/4 p2, 0x0

    .line 50
    iput-object p2, p1, LB4/i;->b:Ljava/lang/Object;

    .line 51
    .line 52
    iget-object p1, p0, Ld/g;->b:Li0/y;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, Ld/g;->b:Li0/y;

    .line 61
    .line 62
    invoke-virtual {p1}, Ld/l;->u()Landroidx/lifecycle/j0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroidx/lifecycle/j0;->a()V

    .line 67
    .line 68
    .line 69
    :cond_2
    iget-object p1, p0, Ld/g;->b:Li0/y;

    .line 70
    .line 71
    iget-object p1, p1, Ld/l;->i:Ld/k;

    .line 72
    .line 73
    iget-object p2, p1, Ld/k;->d:Li0/y;

    .line 74
    .line 75
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p2, p1}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    return-void

    .line 102
    :pswitch_1
    sget-object p1, Landroidx/lifecycle/o;->ON_STOP:Landroidx/lifecycle/o;

    .line 103
    .line 104
    if-ne p2, p1, :cond_5

    .line 105
    .line 106
    iget-object p1, p0, Ld/g;->b:Li0/y;

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-eqz p1, :cond_4

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    goto :goto_0

    .line 119
    :cond_4
    const/4 p1, 0x0

    .line 120
    :goto_0
    if-eqz p1, :cond_5

    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 123
    .line 124
    .line 125
    :cond_5
    return-void

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
