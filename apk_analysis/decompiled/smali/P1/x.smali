.class public final synthetic LP1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LH2/c;


# direct methods
.method public synthetic constructor <init>(LH2/c;I)V
    .locals 0

    .line 1
    iput p2, p0, LP1/x;->a:I

    iput-object p1, p0, LP1/x;->b:LH2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LP1/x;->a:I

    .line 2
    .line 3
    check-cast p1, LH2/c;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p1, LH2/c;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v0, p0, LP1/x;->b:LH2/c;

    .line 11
    .line 12
    iget-object v0, v0, LH2/c;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    iget-object p1, p1, LH2/c;->m:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v0, p0, LP1/x;->b:LH2/c;

    .line 26
    .line 27
    iget-object v0, v0, LH2/c;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
