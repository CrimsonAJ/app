.class public final Lco/notix/b0;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic a:Lco/notix/gb;


# direct methods
.method public constructor <init>(Lco/notix/gb;)V
    .locals 0

    iput-object p1, p0, Lco/notix/b0;->a:Lco/notix/gb;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/b0;->a:Lco/notix/gb;

    check-cast p1, Lorg/json/JSONObject;

    invoke-interface {v0, p1}, Lco/notix/td;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
