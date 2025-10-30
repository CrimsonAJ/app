.class public final synthetic LD0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LD0/a;->a:I

    iput-object p1, p0, LD0/a;->c:Ljava/lang/Object;

    iput p2, p0, LD0/a;->b:I

    iput-object p3, p0, LD0/a;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ln3/l;Ln3/m;I)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, LD0/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/a;->c:Ljava/lang/Object;

    iput-object p2, p0, LD0/a;->d:Ljava/lang/Object;

    iput p3, p0, LD0/a;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LD0/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LD0/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ln3/l;

    .line 9
    .line 10
    iget v1, v0, Ln3/l;->a:I

    .line 11
    .line 12
    iget-object v2, p0, LD0/a;->d:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v3, p0, LD0/a;->b:I

    .line 18
    .line 19
    iget-object v0, v0, Ln3/l;->b:LN3/A;

    .line 20
    .line 21
    invoke-interface {v2, v1, v0, v3}, Ln3/m;->x(ILN3/A;I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget-object v0, p0, LD0/a;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ll4/k;

    .line 44
    .line 45
    iget-boolean v2, v1, Ll4/k;->d:Z

    .line 46
    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    const/4 v2, -0x1

    .line 50
    iget v3, p0, LD0/a;->b:I

    .line 51
    .line 52
    if-eq v3, v2, :cond_1

    .line 53
    .line 54
    iget-object v2, v1, Ll4/k;->b:LA6/i;

    .line 55
    .line 56
    invoke-virtual {v2, v3}, LA6/i;->b(I)V

    .line 57
    .line 58
    .line 59
    :cond_1
    const/4 v2, 0x1

    .line 60
    iput-boolean v2, v1, Ll4/k;->c:Z

    .line 61
    .line 62
    iget-object v2, p0, LD0/a;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Ll4/i;

    .line 65
    .line 66
    iget-object v1, v1, Ll4/k;->a:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-interface {v2, v1}, Ll4/i;->invoke(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    return-void

    .line 73
    :pswitch_1
    iget-object v0, p0, LD0/a;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, LD0/b;

    .line 76
    .line 77
    iget-object v0, v0, LD0/b;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, LD0/c;

    .line 80
    .line 81
    iget v1, p0, LD0/a;->b:I

    .line 82
    .line 83
    iget-object v2, p0, LD0/a;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Ljava/io/Serializable;

    .line 86
    .line 87
    invoke-interface {v0, v1, v2}, LD0/c;->h(ILjava/io/Serializable;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
